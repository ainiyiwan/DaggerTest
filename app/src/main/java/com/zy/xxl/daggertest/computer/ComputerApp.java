package com.zy.xxl.daggertest.computer;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Author ： zhangyang
 * Date   ： 2017/11/10
 * Email  :  18610942105@163.com
 * Description  :
 */

class ComputerApp {

    @Singleton
    @Component(modules = InterEnigineModule.class)
    public interface ComputerShop{
        Computer computer();
    }

    public static void main(String[] args){
        ComputerApp.ComputerShop computerShop = DaggerComputerApp_ComputerShop.builder().build();
        computerShop.computer().start();

    }
}
