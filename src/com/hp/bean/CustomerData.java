package com.hp.bean;

import java.util.ArrayList;
import java.util.List;
//使用单例模式，把客户初始化了
public class CustomerData {
    private static CustomerData ourInstance = new CustomerData();
    private  List<Customer> customerList;

    public static CustomerData getInstance() {
        return ourInstance;
    }

    private CustomerData() {
        //在构造中 初始化数据
        customerList = new ArrayList<>();
        for(int i=0;i<10;i++){
            //每循环一次，就诞生一个Customer 对象，放入到集合当中
            Customer customer = new Customer();
            customer.setAccount("5201314"+i);
            customer.setPassword("123");
            customer.setCname("胡巴"+i+"号");
            customer.setMonery(10000);
            customer.setPhoneNum("123456271823"+i);
            customerList.add(customer);
        }
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
