package com.zy.xxl.daggertest.computer;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * Author ： zhangyang
 * Date   ： 2017/11/10
 * Email  :  18610942105@163.com
 * Description  :
 */

public class Computer {
    private final Lazy<Engine> engine;
    private final Monitor monitor;

    @Inject
    public Computer(Lazy<Engine> engine, Monitor monitor) {
        this.engine = engine;
        this.monitor = monitor;
    }

    public void start(){
        engine.get().start();
        monitor.display();
        System.out.println("动画片开始喽 市场5秒");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    engine.get().off();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
