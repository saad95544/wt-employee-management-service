package com.wissen.service;

import com.wissen.entity.Role;

import java.util.List;

/**
 * Roles service class.
 *
 * @author Vishal Tomar
 */
public interface RoleService {

    /**
     * @author Vishal Tomar
     * @description Method to fetch all roles.
     * @return List of roles.
     */
    public List<Role> getAllRoles();
}