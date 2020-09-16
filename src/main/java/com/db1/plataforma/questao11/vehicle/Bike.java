package com.db1.plataforma.questao11.vehicle;

public class Bike implements Vehicle {

    //Como o método repairVehicle é um default method não é exigida a implementação deste

    @Override
    public void accelerate() {
        System.out.println("Acelerando a bicicleta");
    }

    @Override
    public void breakVehicle() {
        System.out.println("Freiando a bicicleta");
    }

}
