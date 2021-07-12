package com.hp.Service;

import com.hp.bean.Customer;
import com.hp.bean.CustomerData;
import com.hp.util.TestUtil;

import java.util.List;
import java.util.Scanner;

//此类是完成客户的所有业务  （增删改查）
public class Customerservice {
    private List<Customer> customerList;
    private Customer currentCustomer;
    private Scanner scanner;
    //1.查，登录  判断账号密码是否正确
    public void checkPwd(String cardid,String cardpwd){
        CustomerData customerData = CustomerData.getInstance();
        customerList = customerData.getCustomerList();

        //1.拿到cardid里的账号和密码  对list中的数据做对比
        System.out.println("cardid = " + cardid);
        System.out.println("cardpwd = " + cardpwd);

        for (Customer customer : customerList) {
            if (customer.getAccount().equals(cardid) && customer.getPassword().equals(cardpwd)) {
                //拿出来这个人
                currentCustomer=customer;
                //账号正确
                System.out.println("欢迎" + customer.getCname() + "顾客登录，请注意你的安全！");
                TestUtil.oneleveOption();    //界面
                 scanner = new Scanner(System.in);
                String option = scanner.nextLine();
                oneOption(option);
                //如何保证按1 2 3 4 5 让它回到此界面  用递归算法
            }
        }
    }
    private void oneOption(String option){
        switch (option) {
            case "1":
                System.out.println("余额查询");
                //查询余额
                doSelectmoney();
                //当按下1时  回退到1以及选项
                goOneHome();
                break;
            case "2":
                System.out.println("取款");
                TestUtil.quOption();   //界面
                //取款的方法
                GetMoney();
                //返回1级主界面
                goOneHome();
                break;
            case "3":
                System.out.println("转账");
                //转账的方法
                doTruanMoney();
                goOneHome();
                break;
            case "4":
                System.out.println("存款");
                //存款方法
                CunMoney();
                goOneHome();
                break;
            case "5":
                System.out.println("退卡");
                //退卡方法
                doQuitCard();
                break;
        }
    }

    //转账
    private void doTruanMoney() {
        System.out.println("请输入对方的账号号码：");
        scanner=new Scanner(System.in);
        String otherAccount=scanner.nextLine();
        System.out.println("请输入您需要转账的金额：");
        String otherMoney=scanner.nextLine();

        //做计算。。 自已的钱  -otherMoney,  别人的钱 +otherMoney
        Double otherMoneyInt=Double.parseDouble(otherMoney);
        //自已减钱
        //自已被减去转账后的钱
        double currentmoney=currentCustomer.getMonery() - otherMoneyInt;

        //别人加钱，根据otherAccount本人的账户查询出  别人的余额，查出别人的余额后，修改别人的余额
        //因为 所有人都在 customerList 都在这个集合中，那就遍历这个集合
        Customer other=null;
        for (Customer customer : customerList) {
            //如果customer.getAcount  等于  otherAcount ,那就选出这个人了
            if(customer.getAccount().equals(otherAccount)){
                other=customer;
            }
        }
        //别人的钱 加钱
        double otherOnemoney=other.getMonery() + otherMoneyInt;

        //自已和别人  都更新一下 钱数
        currentCustomer.setMonery(currentmoney);
        other.setMonery(otherOnemoney);
    }

    //存款
    private void CunMoney() {
        scanner = new Scanner(System.in);
        System.out.println("请输入您想存入的金额：");
        double i=scanner.nextDouble();

        //判断输入的金额是否是100整数
        if (i>0 && i % 100 ==0) {
            double g = currentCustomer.getMonery() + i;
            System.out.println("您的账户余额是： " + g);

            //把更新的钱数  存入的余额中
            currentCustomer.setMonery(g);
        }else{
            System.out.println("!!!请输入金额为100元，整数的钱!!!");
        }

    }

    //取款
    private void GetMoney() {
         scanner = new Scanner(System.in);
        String pp = scanner.nextLine();
        switch (pp) {
            case "1":
                int a=100;
                Double m=currentCustomer.getMonery()-a;
                //调用取款方法
                if(a<=currentCustomer.getMonery()){
                    System.out.println("请及时拿走现金100");
                    System.out.println("*********************");
                    System.out.println("您的余额为： " + m);
                }else{
                    System.out.println("您卡上的余额不足！！");
                }
                //把更新的余额  存入到取款过后的余额中
                currentCustomer.setMonery(m);
                break;
            case "2":
                int b=200;
                Double m1=currentCustomer.getMonery()-b;
                //调用取款方法
                if(b<=currentCustomer.getMonery()){
                    System.out.println("请及时拿走现金200");
                    System.out.println("*********************");
                    System.out.println("您的余额为： " + m1);
                }else{
                    System.out.println("您卡上的余额不足！！");
                }
                //把更新的余额  存入到取款过后的余额中
                currentCustomer.setMonery(m1);
                break;
            case "3":
                int c=300;
                Double m2=currentCustomer.getMonery()-c;
                //调用取款方法
                if(c<=currentCustomer.getMonery()){
                    System.out.println("请及时拿走现金300");
                    System.out.println("*********************");
                    System.out.println("您的余额为： " + m2);
                }else{
                    System.out.println("您卡上的余额不足！！");
                }
                //把更新的余额  存入到取款过后的余额中
                currentCustomer.setMonery(m2);
                break;
            case "4":
                int d=500;
                Double m3=currentCustomer.getMonery()-d;
                //调用取款方法
                if(d<=currentCustomer.getMonery()){
                    System.out.println("请及时拿走现金500");
                    System.out.println("*********************");
                    System.out.println("您的余额为： " + m3);
                }else{
                    System.out.println("您卡上的余额不足！！");
                }
                //把更新的余额  存入到取款过后的余额中
                currentCustomer.setMonery(m3);
                break;
            case "5":
                int e=800;
                Double m4=currentCustomer.getMonery()-e;
                //调用取款方法
                if(e<=currentCustomer.getMonery()){
                    System.out.println("请及时拿走现金800");
                    System.out.println("*********************");
                    System.out.println("您的余额为： " + m4);
                }else{
                    System.out.println("您卡上的余额不足！！");
                }
                //把更新的余额  存入到取款过后的余额中
                currentCustomer.setMonery(m4);
                break;
            case "6":
                int f=1000;
                Double m5=currentCustomer.getMonery()-f;
                //调用取款方法
                if(f<=currentCustomer.getMonery()){
                    System.out.println("请及时拿走现金1000");
                    System.out.println("*********************");
                    System.out.println("您的余额为： " + m5);
                }else{
                    System.out.println("您卡上的余额不足！！");
                }
                //把更新的余额  存入到取款过后的余额中
                currentCustomer.setMonery(m5);
                break;
            case "7":
                int h=2000;
                Double m6=currentCustomer.getMonery()-h;
                //调用取款方法
                if(h<=currentCustomer.getMonery()){
                    System.out.println("请及时拿走现金2000");
                    System.out.println("*********************");
                    System.out.println("您的余额为： " + (currentCustomer.getMonery()-h));
                }else{
                    System.out.println("您卡上的余额不足！！");
                }
                //把更新的余额  存入到取款过后的余额中
                currentCustomer.setMonery(m6);
                break;
            case "8":
                System.out.println("其他");
                break;
            default:
                System.out.println("请输入正确的序号！！");
        }
    }


    //查询余额
    private void doSelectmoney() {
      double monery= currentCustomer.getMonery();
        System.out.println("余额还有：" + monery);
    }
    //取款
    /*private void qukuai(){
        Scanner scanner=new Scanner(System.in);
        double oo= scanner.nextDouble();
        if(oo<=currentCustomer.getMonery()){
            System.out.println("*********************");
            System.out.println("您的余额为： " + (currentCustomer.getMonery()-oo));
        }else{
            System.out.println("您卡上的余额不足！！");
        }

    }*/
    //退卡
    private void doQuitCard() {
        System.out.println("您是否继续操作yes/no[Y/N]");
         scanner = new Scanner(System.in);
          String s = scanner.nextLine();
         if(s.equalsIgnoreCase("y")){
             TestUtil.welcome();
         }
        if(s.equalsIgnoreCase("n")){
            System.out.println("over");
        }
    }

    private void goOneHome(){
        TestUtil.oneleveOption();
        Scanner scanner = new Scanner(System.in);
        String option=scanner.nextLine();
        System.out.println("option1 = " + option);
        oneOption(option);   //递归算法
    }
}
