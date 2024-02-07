package com.example.user.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.user.entity.User;
@Service
public class UserSeriveImpl implements UserService {

    public static int userCount = 5;
    private static List<User> users = new ArrayList<>();
    static
    {
        users.add(new User(1,"john",new Date()));
        users.add(new User(2,"robert",new Date()));
        users.add(new User(3,"Adam",new Date()));
        users.add(new User(4, "Jack", new Date()));
        users.add(new User(5,"ram",new Date()));
    }
    @Override
    public List<User> findAll() {
      
        return users;
    }

    @Override
    public User save(User u) {
        if(u.getId() == null)
        {
            u.setId(++userCount);
        }
        users.add(u);
        return u;
        
        
    }

    @Override
    public User findOne(int id) {
       
        for(User u : users){
            if(u.getId() == id ) 
            return u;
        }
            return null;
    }

    // public User deleteById(int id)
    // {
    //     Iterator<User> i = users.iterator();
    //     while(i.hasNext())
    //     {
    //         User u = i.next();
    //         if(id == u.getId())
    //         {
    //             i.remove();
    //             return u;
    //         }
    //     }
    //     return null;
    // }

    @Override
    public User deletUser(int id) {
        // TODO Auto-generated method stub
        Iterator<User> i = users.iterator();   //for(User u: users){if()}
        while(i.hasNext())
        {
            User u = i.next();
            if(id == u.getId())
            {
                i.remove();
                return u;
            }
        }
        return null;
    }
    
}
