package com.lsj.springboot.creational.prototype;

/**
 * Created by 10326 on 2020/11/8.
 */
public class Student implements Cloneable {
    private String name;
    Address address;
    public Student(String name, Address address) {
        super();
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Student clone(){
        Student student = null;
        try {
            student = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        student.address = address.clone();
        return student;
    }
    public static void main(String[] args) {
        Address address = new Address("北京");
        Student s = new Student("张三", address);
        Student sclone = (Student) s.clone();
        System.out.println("学生姓名：" + s.getName() + "   克隆学生姓名：" + sclone.getName());
        System.out.println("学生地址：" + s.address.getLocation() + "   克隆学生地址：" + sclone.address.getLocation());
        System.out.println("两个学生对象"+(s == sclone ? "相同" : "不同"));  //测试被可伶的对象与原对象是否是同一个对象
        System.out.println("修改被克隆学生姓名为李四，地址为四川，");
        s.setName("李四");
        s.address.setLocation("四川");
        System.out.println("学生姓名：" + s.getName() + "   克隆学生姓名：" + sclone.getName());
        System.out.println("学生地址：" + s.address.getLocation() + "   克隆学生地址：" + sclone.address.getLocation());
    }

}
