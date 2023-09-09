package com.cove.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cove.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findAdminByUsername(String username);
}
