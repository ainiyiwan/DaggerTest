package com.zy.xxl.daggertest.computer;

import dagger.Binds;
import dagger.Module;

/**
 * Author ： zhangyang
 * Date   ： 2017/11/10
 * Email  :  18610942105@163.com
 * Description  :
 */
@Module
abstract class MonitorModule {
    @Binds
    abstract Monitor provideMonitor(LiquidCrystalDisplay monitor);
}
