package com.lsj.springboot.structural.adapter.objectAdapter;

import com.lsj.springboot.structural.adapter.classAdapter.Adaptee;
import com.lsj.springboot.structural.adapter.classAdapter.TargetInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 10326 on 2019/8/18.
 */
@Service
public class Adapter1 implements TargetInterface1 {

    @Autowired
    private Adaptee1 adaptee1;

    public void targetMethod(){
        adaptee1.targetMethod();
    }

}
