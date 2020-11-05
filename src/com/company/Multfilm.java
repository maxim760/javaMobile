package com.company;

public class Multfilm extends Film {
  public String country;

  Multfilm(String country, int year, String name, String genre) {
    super(year, name, genre);
    this.country = country;
  }

  public void info() {
    super.info();
    System.out.println("Страна:" + this.country);
  }
  public void info(int year) {
    System.out.println("Страна:" + this.country);
    System.out.println("Год:" + year);
  }

}
