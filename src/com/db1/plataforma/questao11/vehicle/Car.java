package com.db1.plataforma.questao11.vehicle;

public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Acelerando o carro");
    }

    @Override
    public void breakVehicle() {
        System.out.println("Freiando o carro");
    }

    @Override
    public void repairVehicle() {
        System.out.println("Realizando manutenção no carro");
    }

}
