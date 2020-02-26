package com.lsj.springboot.creational.build.Build;

import com.lsj.springboot.creational.build.Entity.Car;
import com.lsj.springboot.creational.build.Service.CreateCar;
import org.springframework.stereotype.Component;

/**
 * Created by 10326 on 2019/7/28.
 */
@Component
public class CarDirector {

    public Car direct(CreateCar createCar){

        createCar.selectCarDoor();
        createCar.selectColor();
        createCar.selectTires();
        return createCar.getCar();

    };

}
