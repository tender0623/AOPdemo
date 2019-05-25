package com.project.service.impl;

import com.project.service.UserService;
import org.springframework.stereotype.Component;


/**
 * Created by Administrator on 2019/2/28.
 */
@Component
public class UserServiceImpl implements UserService {
    public void saveUser(String user) {
        System.out.println("save"+user);
       // throw new RuntimeException("save exception");
    }

    public int updateUser(String user) {
        System.out.println("update"+user);
        return 0;
    }
}
