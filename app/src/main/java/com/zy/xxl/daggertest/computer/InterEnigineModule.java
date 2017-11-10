package com.zy.xxl.daggertest.computer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Author ： zhangyang
 * Date   ： 2017/11/10
 * Email  :  18610942105@163.com
 * Description  :
 */

@Module(includes = MonitorModule.class)
class InterEnigineModule {
    @Provides
    @Singleton
    Engine providerEngine(){
        return new IntelEngine();
    }
}

