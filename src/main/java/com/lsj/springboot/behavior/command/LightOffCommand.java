package com.lsj.springboot.behavior.command;

/**
 * Created by 10326 on 2019/10/13.
 */
public class LightOffCommand implements Command{

    private Light light;

    /**
     * 创建关灯命令的时候，传入具体的灯对象，由灯对象操作自己
     * @param light
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    /**
     * 具体的灯对象调用自己的关灯方法
     */
    public void execute() {
        light.lightOff();
    }

}
