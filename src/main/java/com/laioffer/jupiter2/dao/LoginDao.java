package com.laioffer.jupiter2.dao;

import com.laioffer.jupiter2.entity.db.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao
{
    @Autowired
    private SessionFactory sessionFactory;

    // Verify if the given user id and password are correct. Returns the username when it passes
    public String verifyLogin(String userId, String password)
    {
        String name = "";

        //https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
        try (Session session = sessionFactory.openSession())
        {
            User user = session.get(User.class, userId);
            if (user != null && user.getPassword().equals((password)))
                name = user.getFirstName();

        }

        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return name;
    }
}

