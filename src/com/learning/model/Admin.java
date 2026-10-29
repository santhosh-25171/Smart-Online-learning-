package com.learning.model;

public class Admin extends User {
    private String adminId;
    private String roleLevel;

    public Admin() {
    }

    public Admin(String id, String name, String email, String adminId, String roleLevel) {
        super(id, name, email);
        this.adminId = adminId;
        this.roleLevel = roleLevel;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(String roleLevel) {
        this.roleLevel = roleLevel;
    }
}
