package com.jtcindia.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "CustomerA")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cid")
    private int cid;

    @Column(name = "Cname")
    private String cname;

    @Column(name = "Email")
    private String email;

    @Column(name = "Phone")
    private long phone;

    @Column(name = "City")
    private String city;

    @Column(name = "Bal")
    private double bal;

    public Customer() {
    }

    public Customer(int cid, String cname, String email, long phone, String city, double bal) {
        this.cid = cid;
        this.cname = cname;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.bal = bal;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }
}

