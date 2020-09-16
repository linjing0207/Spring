package com.linjing.demo01;

//中介：帮房东代理出租业务
//继承"出租房屋"接口
public class Proxy implements Lease{
    private Landlord landlord;

    public Proxy() {
    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    //代理帮房东出租房子
    public void lease() {
        visit(); //看房
        landlord.lease(); //房东出租
        signContract(); //签合同
        charge(); //收费
    }

    //看房
    public void visit(){
        System.out.println("中介：带你看房。");
    }

    //收中介费
    public void charge(){
        System.out.println("中介：收中介费");
    }

    //签租赁合同
    public void signContract(){
        System.out.println("中介：签合同");
    }
}
