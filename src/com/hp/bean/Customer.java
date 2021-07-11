package com.hp.bean;

public class Customer {
    private  String account,password,cname,phoneNum;
    private double monery;
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public double getMonery() {
        return monery;
    }

    public void setMonery(double monery) {
        this.monery = monery;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", cname='" + cname + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", monery=" + monery +
                '}';
    }
}
