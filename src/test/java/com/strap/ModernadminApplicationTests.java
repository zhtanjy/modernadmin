package com.strap;

import cn.hutool.crypto.SecureUtil;
import com.strap.mapper.UserMapper;
import com.strap.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ModernadminApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void insertUser(){
        User user = new User();
        user.setName("李四");
        user.setEmail("bbbbbb@163.com");
        user.setPassword(SecureUtil.md5("123456"));
        user.setGmtCreate(System.currentTimeMillis());
        user.setGmtModified(System.currentTimeMillis());
        userMapper.insert(user);


    }

}
