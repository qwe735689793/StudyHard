package com.demo.serviceImpl;

import com.demo.entity.Account;
import com.demo.mapper.AccountMapper;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sch
 * @create 2019/3/29
 */
//业务逻辑实现层
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    /*根据用户id获取用户*/
    public Account getUserById(int userId) {
        return accountMapper.selectByPrimaryKey(userId);
    }

    @Override
    /*根据用户name获取用户*/
    public Account getUserByName(String name) {
        return accountMapper.selectByPrimaryName(name);
    }

    @Override
    /*查询所有账号*/
    public List<Account> getAllAcount() {
        return accountMapper.selectAllAcount();
    }

    @Override
    /*增加一个用户*/
    public int addUser(Account user) {
        return accountMapper.insertSelective(user);
    }
}