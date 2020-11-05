package com.company;

public class Car {



  String name;// по умолчанию // доступно из данного пакета
  public int power; // их любого пакета в рамках проекта
  private double runtime; // внутри класса
  protected int wheels; // внутри класса и наследников

  // перегрущка конгстурктора
  Car(){

  }
  Car(String name, int power,double runtime, int wheels) {
    this.name = name;
    this.power = power;
    this.runtime = runtime;
    this.wheels = wheels;
  }

  public double getRuntime() {
    return runtime;
  }

  public void setRuntime(double runtime) {
    this.runtime = runtime;
  }

  public void doMove() {
    System.out.println("...Moving");
  }
  public void doFuel() {
    System.out.println("Fuel");
  }
}
