package com.db1.plataforma.questao11.vehicle;

//Interface de Veículos que define todos os comportamentos que um veículo deve possuir
public interface Vehicle {

    String getIdentifier();

    void accelerate();

    void breakVehicle();

    //Utilização de método default em interface tornando sua implementação opcional
    default void repairVehicle() {
        System.out.println("Realizando manutenção no veículo " + getIdentifier());
    }

}
