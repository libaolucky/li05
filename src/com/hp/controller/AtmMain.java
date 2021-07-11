package com.hp.controller;

import com.hp.bean.Customer;
import com.hp.bean.CustomerData;
import com.hp.util.TestUtil;

import java.util.List;
import java.util.Scanner;

public class AtmMain {

    private static String cardid;
    private static String cardpwd;

    public static void main(String[] args) {
        //测试 客户类的数据
        //作业1：对manger管理类做出  单例模式  并测试是否数据初始化了
        CustomerData customerData = CustomerData.getInstance();
        List<Customer> customerList = customerData.getCustomerList();

        //遍历
        for (Customer customer : customerList) {
            System.out.println("customer = " + customer);
        }

        //这是一个阶段
        TestUtil.welcome();
        int i=0;
        while(i<5){
            //输入账户密码  一个阶段  练习：超过5次就终结程序（跳出循环）
            doWriterPassword();
            //其他操作---（1）校验校色
            doCheckPassword(cardid,cardpwd);
            i++;
        }
    }


  //判断角色和密码
    private static  void doCheckPassword(String cardid ,String cardpwd){

    }

    //输入账号密码
    private static void doWriterPassword() {
        System.out.println("请输入卡号：");
        Scanner scanner = new Scanner(System.in);
        cardid = scanner.nextLine();
        System.out.println("cardid = " + cardid);
        System.out.println("请输入密码：");
        cardpwd = scanner.nextLine();
        System.out.println("cardpwd = " + cardpwd);
    }



}
