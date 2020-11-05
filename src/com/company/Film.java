package com.company;

public class Film {
  public int year;
  private String genre;
  public String name;

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getGenre() {
    System.out.println("Новый жанр " + genre);
    return genre;
  }

  public void info() {
    System.out.println("Фильм:"  + this.name + ",Дата выхода:" + this.year);
  }

  Film(int year, String name, String genre) {
      this.year = year;
      this.genre = genre;
      this.name = name;
    }
}
