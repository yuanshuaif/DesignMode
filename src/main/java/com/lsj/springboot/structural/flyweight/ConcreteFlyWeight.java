package com.lsj.springboot.structural.flyweight;

/**
 * Created by 10326 on 2019/8/28.
 * 具体的享元类
 */
public class ConcreteFlyWeight extends AbstractFlyWeight {

    @Override
    public void operate(String extrinsic) {
        System.out.println(extrinsic + "askjdhadd");
    }
}
