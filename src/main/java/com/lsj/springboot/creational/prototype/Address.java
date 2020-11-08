package com.lsj.springboot.creational.prototype;

import java.io.Serializable;

/**
 * Created by 10326 on 2020/11/8.
 */
public class Address implements Cloneable, Serializable{
    private String location;
    public Address(String location){
        this.location=location;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public Address clone(){
        Address address = null;
        try {
            address = (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return address;
    }

    public static void main(String[] args){
        Address address = new Address("北京");
        Address  cloneAddress= address.clone();
        System.out.println("提供的原型城市名称:  "+address.getLocation());
        System.out.println("克隆的的城市名称:  "+cloneAddress.getLocation());
        System.out.println("两个城市对象"+(address == cloneAddress?"相同":"不同"));
    }
}
