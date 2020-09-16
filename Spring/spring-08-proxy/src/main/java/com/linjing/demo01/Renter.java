package com.linjing.demo01;

//租客：客户端
public class Renter {
    public static void main(String[] args) {
        //房东
        Landlord landlord = new Landlord();
        //代理角色一般会有一些附属操作
        Proxy proxy = new Proxy(landlord);
        //你不用面对房东，直接找中介租房即可。
        proxy.lease();
    }
}
