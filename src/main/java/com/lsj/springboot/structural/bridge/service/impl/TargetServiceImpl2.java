package com.lsj.springboot.structural.bridge.service.impl;

import com.lsj.springboot.structural.bridge.service.ITargetService;

/**
 * Created by 10326 on 2019/8/25.
 */
public class TargetServiceImpl2 implements ITargetService{
    @Override
    public void operation() {
        System.out.println("我是目标接口实现类2");
    }
}
