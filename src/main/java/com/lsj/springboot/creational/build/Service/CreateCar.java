package com.lsj.springboot.creational.build.Service;

import com.lsj.springboot.creational.build.Entity.Car;

/**
 * Created by 10326 on 2019/7/28.
 */
public interface CreateCar {

    public static Car car = new Car();

    public void selectColor();

    public void selectCarDoor();

    public void selectTires();

    public Car getCar();

}
