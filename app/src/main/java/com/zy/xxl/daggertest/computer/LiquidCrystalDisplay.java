package com.zy.xxl.daggertest.computer;

import javax.inject.Inject;

/**
 * Author ： zhangyang
 * Date   ： 2017/11/10
 * Email  :  18610942105@163.com
 * Description  :液晶显示器
 */

class LiquidCrystalDisplay implements Monitor {

    private final Engine engine;

    // TODO: 2017/11/10 第一步
    @Inject
    public LiquidCrystalDisplay(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void display() {
        if (engine.work()){
            System.out.println("LiquidCrystalDisplay 开始放映");
        }
    }
}
