package com.laioffer.jupiter2.service;

import com.laioffer.jupiter2.dao.RegisterDao;
import com.laioffer.jupiter2.entity.db.User;
import com.laioffer.jupiter2.util.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RegisterService
{
    @Autowired
    private RegisterDao registerDao;

    public boolean register(User user) throws IOException
    {
        user.setPassword(Util.encryptPassword(user.getUserId(), user.getPassword()));
        return registerDao.register(user);
    }
}
