package com.zy.xxl.daggertest.computer;

/**
 * Author ： zhangyang
 * Date   ： 2017/11/10
 * Email  :  18610942105@163.com
 * Description  :
 */

class IntelEngine implements Engine {
    boolean work;
    @Override
    public void start() {
        System.out.println("IntelEngine starting");
        this.work = true;
    }

    @Override
    public boolean work() {
        System.out.println("IntelEngine working");
        return work;
    }

    @Override
    public void off() {
        this.work = false;
        System.out.println("IntelEngine offing");
    }
}
