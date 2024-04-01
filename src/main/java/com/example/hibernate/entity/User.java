package com.example.hibernate.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author heyunlin
 * @version 1.0
 */
@Data
@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 18L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;

    /**
     * 密码
     */
    @Column(name = "address")
    private String address;
}