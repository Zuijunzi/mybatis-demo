package com.fu.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Auther: Fuys
 * @Date: 2023/2/14 - 02 - 14 - 21:31
 * @Description: com.fu.entity
 * @version: 1.0
 */
public class Orders {
    /*订单编号*/
    private int id;
    /*订单日期*/
    @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private String  orderTime;
    /*订单总额*/
    private double total;
    /*用户编号*/
    private int uid;

    private User user;

    public Orders() {
    }

    public Orders(int id, String orderTime, double total, int uid) {
        this.id = id;
        this.orderTime = orderTime;
        this.total = total;
        this.uid = uid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderTime='" + orderTime + '\'' +
                ", total=" + total +
                ", uid=" + uid +
                ", user=" + user +
                '}';
    }
}
