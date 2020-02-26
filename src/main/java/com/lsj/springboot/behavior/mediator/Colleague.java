package com.lsj.springboot.behavior.mediator;

/**
 * Created by 10326 on 2019/10/13.
 * 抽象同时类
 */
public abstract class Colleague {
    protected String name;
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
