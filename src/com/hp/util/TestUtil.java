package com.hp.util;

/*
* 文本信息的工具类
* 以后修改文本信息，直接去修改这里就可以了
* */
public class TestUtil {
    /* welcome的界面
    *  static 修饰方法：1、可以直接被类名.方法名（）调用
    *   2.在内存中只有1份，其他修改，它会跟着修改
    *   还有关于static静态代码块，她一般适用于界面场景的提前加载，如王者荣耀中峡谷的轮廓永远优先英雄出现
    *   static{
    *       //这就是静态代码块
    *   }
    * */

    public static  void welcome(){
        System.out.println("***********");
        System.out.println("*先生/女士***");
        System.out.println("****欢迎使用ATM取款机*****");
        System.out.println("***********");
    }

    //客户的1级选择   主菜单
    public static void oneleveOption(){
        System.out.println("********************************");
        System.out.println("****请输入你想要的操作类型**********");
        System.out.println("****1.余额查询     2.取款**********");
        System.out.println("****3.转账     4.存款**********");
        System.out.println("****5.退卡  *****************");
        System.out.println("********************************");
    }
    //取款的选项
    public static void quOption(){
        System.out.println("********************************");
        System.out.println("****请输入您想取款的数目：**********");
        System.out.println("****1.100    2.200**********");
        System.out.println("****3.300     4.500**********");
        System.out.println("****5.800     6.1000  *****************");
        System.out.println("*****7.2000   8.其他**********************");
        System.out.println("********************************");

    }
}
