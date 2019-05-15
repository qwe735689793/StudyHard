package com.demo.service;

import com.demo.entity.Account;

import java.util.List;

/*业务逻辑接口层*/
public interface UserService {
    /*根据用户id获取用户*/
    Account getUserById(int id);

    /*根据用户name获取用户*/
    Account getUserByName(String name);

    /*查询所有账号*/
    List<Account> getAllAcount();

    /*增加一个用户*/
    int addUser(Account user);
}