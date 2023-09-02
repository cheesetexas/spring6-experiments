package org.example.dao.impl;

import org.example.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoRedisImpl implements UserDao {
    @Override
    public void print() {
        System.out.println("Redis Dao层执行结束");
    }
}
