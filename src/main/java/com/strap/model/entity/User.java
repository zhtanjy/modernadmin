package com.strap.model.entity;

import lombok.Data;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-03-30 21:53:58
 */
@Data
public class User  {

    private Integer id;
    
    private String accountId;
    
    private String name;
    
    private String email;
    
    private String token;
    
    private Long gmtCreate;
    
    private Long gmtModified;
    
    private String ibo;
    
    private String password;



}