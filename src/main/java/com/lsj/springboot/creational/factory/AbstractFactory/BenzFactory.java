package com.lsj.springboot.creational.factory.AbstractFactory;

/**
 * Created by 10326 on 2019/4/21.
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car newCarInstance() {
        return new Benz();
    }

    @Override
    public Plane newPlaneInstance() {
        return new BenzPlane();
    }
}
