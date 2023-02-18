package com.fu.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * @Auther: Fuys
 * @Date: 2023/2/14 - 02 - 14 - 21:34
 * @Description: com.fu.entity
 * @version: 1.0
 */
public class User {
    private int id;
    private String username;
    private String password;
    @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Date birthday;
    private List<User> orders;
    private List<Role> roles;

    public User() {
    }

    public User(int id, String username, String password, Date birthday, List<User> orders, List<Role> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.orders = orders;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<User> getOrders() {
        return orders;
    }

    public void setOrders(List<User> orders) {
        this.orders = orders;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", orders=" + orders +
                ", roles=" + roles +
                '}';
    }
}
