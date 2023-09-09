package com.cove.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cove.interfaces.AdminRepository;
import com.cove.model.Admin;


@Service
public class AdminDetailsService implements UserDetailsService  {

    private final AdminRepository adminRepository;

    public AdminDetailsService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
          Admin admin = adminRepository.findAdminByUsername(username);
        if (admin == null) {
            throw new UsernameNotFoundException("Admin not found");
        }

        return org.springframework.security.core.userdetails.User
            .withUsername(admin.getUsername())
            .password(admin.getPassword())
            .roles(admin.getRole().split(",")) // Convert roles string to array
            .build();
    }
}