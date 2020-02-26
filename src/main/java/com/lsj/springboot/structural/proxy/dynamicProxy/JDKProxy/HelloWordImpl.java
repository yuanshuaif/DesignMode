package com.lsj.springboot.structural.proxy.dynamicProxy.JDKProxy;

/**
 * Created by Administrator on 2019/1/31.
 */
public class HelloWordImpl implements HelloWord {
    @Override
    public void sayHelloWord() {
        System.out.println("Hello Word!");
    }
}
