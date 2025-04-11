package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleDao {

    public List<Role> findAll();

    public Set<Role> findRoleByName(String name);

    void saveRole(Role role);
}
