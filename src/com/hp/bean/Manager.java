package com.hp.bean;

public class Manager {
    private String acount,password,mname;

    public String getAcount() {
        return acount;
    }

    public void setAcount(String acount) {
        this.acount = acount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "acount='" + acount + '\'' +
                ", password='" + password + '\'' +
                ", mname='" + mname + '\'' +
                '}';
    }
}
