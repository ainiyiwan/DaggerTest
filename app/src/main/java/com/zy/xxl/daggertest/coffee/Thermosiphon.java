package com.zy.xxl.daggertest.coffee;

import javax.inject.Inject;

/**
 * 热虹吸管
 */
class Thermosiphon implements Pump {
  private final Heater heater;

  @Inject
  Thermosiphon(Heater heater) {
    this.heater = heater;
  }

  @Override public void pump() {
    if (heater.isHot()) {
      System.out.println("=> => pumping => =>");
    }
  }
}
