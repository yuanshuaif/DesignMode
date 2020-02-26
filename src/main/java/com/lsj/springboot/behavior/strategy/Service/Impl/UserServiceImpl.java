package com.lsj.springboot.behavior.strategy.Service.Impl;

import com.lsj.springboot.behavior.strategy.Handler.TypeHandler;
import com.lsj.springboot.behavior.strategy.HandlerTemplate;
import com.lsj.springboot.behavior.strategy.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 10326 on 2019/4/20.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private HandlerTemplate handlerTemplate;

    @Override
    public void getNameByType(String type) {

        TypeHandler typeHandler = handlerTemplate.newHandlerInstance(type);
        System.out.println(typeHandler.dealMethodByType());

    }
}
