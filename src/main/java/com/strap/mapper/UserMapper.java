package com.strap.mapper;

import com.strap.model.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

/**
 * @author 谭俊彦
 * @version 1.0 2020-03-30 22:12
 * @description
 */
@Component(value = "userMapper")
public interface UserMapper {
    @Insert("insert into USER (NAME,EMAIL,PASSWORD,GMT_CREATE,GMT_MODIFIED) values (#{name},#{email},#{password},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}
