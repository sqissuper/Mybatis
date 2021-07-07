package com.example.demo.mybatisee.model;

import lombok.Data;

import java.util.Date;

/**
 * ClassName:UserInfo
 * Package:com.example.demo.mybatisee.model
 * Description:
 *
 * @Author:HP
 * @date:2021/7/6 11:00
 */
@Data
public class UserInfo {
    private int id;
    private String username;
    private String password;
    private String photo;
    private Date createtime;
    private  Date updatetime;
    private int state;
}
