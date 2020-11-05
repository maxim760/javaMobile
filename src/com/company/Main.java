package com.company;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car();
//        bmw.doMove();
        bmw.power= 500;
        bmw.name = "BMW";
        bmw.setRuntime(120);
//        System.out.println(bmw.getRuntime());

        ECar tesla = new ECar("tesla",200,13,122,100);
//        tesla.doMove();
        tesla.doFuel(22);
        System.out.println(tesla);
        // changed
    }
}
