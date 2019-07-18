package com.example.demo.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author: Cavan.Liu
 * @date: 2019-07-17 10:06:23
 * @description:
 */
@Data
@XmlRootElement
public class User {
    private long id;            // 用户的唯一标识
    private String name;
    private int age;
}
