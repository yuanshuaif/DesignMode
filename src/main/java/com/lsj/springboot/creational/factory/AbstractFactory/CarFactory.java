package com.lsj.springboot.creational.factory.AbstractFactory;

/**
 * Created by 10326 on 2019/4/21.
 */
public interface CarFactory {

    Car newCarInstance();

    Plane newPlaneInstance();

}
