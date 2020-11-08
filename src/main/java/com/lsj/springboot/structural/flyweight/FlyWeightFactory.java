package com.lsj.springboot.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 10326 on 2019/8/28.
 * 享元工厂
 */
public class FlyWeightFactory {

    /*享元数据存储的map*/
    private static Map<String, AbstractFlyWeight> map = new HashMap<>();

    // 使用内部状态作为hashMap的key，用来标识是一个对象
    public static AbstractFlyWeight getFlyWeight(String key){
        AbstractFlyWeight abstractFlyWeight = null;
        if(map.containsKey(key)){
            System.out.print("已有 " + key + " 直接从池中取---->");
            abstractFlyWeight = map.get(key);
        }else{
            System.out.print("创建 " + key + " 并从池中取出---->");
            abstractFlyWeight = new ConcreteFlyWeight(key);
            map.put(key, abstractFlyWeight);
        }
        return abstractFlyWeight;
    }

}
