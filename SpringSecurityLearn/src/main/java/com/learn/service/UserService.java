package com.learn.service;

import com.learn.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> list=new ArrayList<>();

    public UserService()
    {
        list.add(new User("ravi","ravi123@","ravi@gmail.com","ADMIN"));
        list.add(new User("kanak","kanak123@","kanak@gmail.com","NORMAL"));
        list.add(new User("smita","smita123@","smita@gmail.com","NORMAL"));
    }


    //get all Users
    public List<User> getAllUser()
    {
        return this.list;
    }

    //get User Detail by Specific username
    public  User getUser(String username)
    {
        for (User ob:list) {
            if (ob.getUsername().equals(username))
            {
                return ob;
            }
        }
        return  null;
    }

    //add user
    public User adduser(User user)
    {
        this.list.add(user);
        return user;
    }

}
