package com.demo.mapper;

import com.demo.entity.Account;

import java.util.List;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    /*根据id查询账号*/
    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    Account selectByPrimaryName(String name);

    /*查询所有账号*/
    List<Account> selectAllAcount();
}