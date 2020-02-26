package com.lsj.springboot.creational.factory.AbstractFactory;

/**
 * Created by 10326 on 2019/4/21.
 */
public class FordFactory implements CarFactory {
    @Override
    public Car newCarInstance() {
        return new Ford();
    }

    @Override
    public Plane newPlaneInstance() {
        return new FordPlane();
    }
}
