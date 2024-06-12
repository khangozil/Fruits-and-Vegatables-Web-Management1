/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Quynhh Nhuu
 */
public class Order {
    private String order_id;
    private Date order_date;
    private Time order_time;
    private int total_price;
    private String acc_id;
    private String voucher;

    public Order() {
    }

    public Order(String order_id, Date order_date, Time order_time, int total_price, String acc_id, String voucher) {
        this.order_id = order_id;
        this.order_date = order_date;
        this.order_time = order_time;
        this.total_price = total_price;
        this.acc_id = acc_id;
        this.voucher = voucher;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Time getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Time order_time) {
        this.order_time = order_time;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public String getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(String acc_id) {
        this.acc_id = acc_id;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }
     
}
