package com.lsj.springboot.creational.factory.FactoryMethod;

/**
 * Created by 10326 on 2019/4/16.
 */
public class FordFactory implements CarFactory {
    @Override
    public Car newInstance() {
        return new Ford();
    }
}
