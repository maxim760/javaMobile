package com.company;

public class Main {

    public static void main(String[] args) {
        Film nameOfFilm = new Film(1998,"Название","Драма");
        nameOfFilm.info();
        nameOfFilm.setGenre("Детектив");
        nameOfFilm.getGenre();

        Multfilm mult = new Multfilm("CША",2015,"Мультик", "Мультфильмы");
        mult.info();
        mult.info(2020);

    }
}
