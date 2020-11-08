package com.lsj.springboot.creational.prototype;

import java.io.*;

/**
 * Created by 10326 on 2020/11/8.
 */
public class Author implements Serializable {
    private String name;
    Address address;

    public Author(String name, Address address) {
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

    public Author absoluteClone() throws IOException, ClassNotFoundException, OptionalDataException {
        // 将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        // 将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Author) ois.readObject();
    }

    public static void main(String[] args) throws OptionalDataException, ClassNotFoundException, IOException {
        Address address = new Address("南京");
        Author author = new Author("老王", address);
        Author cloneAuthor = author.absoluteClone();
        System.out.println("原作者作者姓名:  " + author.getName() + " 住址:  " + author.getAddress().getLocation());
        System.out.println("克隆作者姓名:  " + cloneAuthor.getName() + " 住址:  " + cloneAuthor.getAddress().getLocation());
        System.out.println("修改原作者姓名为 隔壁老王，住址为 北京");
        author.setName("隔壁老王");
        author.setAddress(new Address("北京"));
        System.out.println("原作者作者姓名:  " + author.getName() + " 住址:  " + author.getAddress().getLocation());
        System.out.println("克隆作者姓名:  " + cloneAuthor.getName() + " 住址:  " + cloneAuthor.getAddress().getLocation());

    }
}
