package com.company.dao;

import com.company.dao.pojo.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();
}
