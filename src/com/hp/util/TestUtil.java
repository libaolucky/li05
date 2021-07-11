package com.hp.util;

/*
* 文本信息的工具类
* 以后修改文本信息，直接去修改这里就可以了
* */
public class TestUtil {
    /* welcome的界面
    *  static 修饰方法：1、可以直接被类名.方法名（）调用
    *   2.在内存中只有1份，其他修改，它会跟着修改
    *   还有关于static静态代码块，她一般适用于界面场景的提前加载，如王者综峡谷的轮廓永远优先英雄出现
    *   static{
    *       //这就是静态代码块
    *   }
    * */

    public static  void welcome(){
        System.out.println("***********");
        System.out.println("*先生/女士***");
        System.out.println("****欢迎使用ATM取款机*");
        System.out.println("***********");
    }
}
