package com.company;

public class ECar extends Car {
  private int battery;
  ECar() {

  }
  ECar(String name, int power, double runtime, int wheels, int b) {
    super(name, power, runtime, wheels);
    this.battery = b;
  }

  // переопределение
  public void doMove() {
    System.out.println("...");
  }
  public void doFuel(int power) {
    super.doFuel();
    System.out.println("Name" + this.name + "; Power:" + power);
  }
}
