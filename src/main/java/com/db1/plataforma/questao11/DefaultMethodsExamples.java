package com.db1.plataforma.questao11;

import com.db1.plataforma.questao11.vehicle.Bike;
import com.db1.plataforma.questao11.vehicle.Car;
import com.db1.plataforma.questao11.vehicle.Vehicle;

public class DefaultMethodsExamples {

    public static void main(String[] args) {

        Vehicle bike = new Bike("Monark");
        Vehicle car = new Car("Siena");

        car.accelerate();
        car.breakVehicle();
        car.repairVehicle();

        System.out.println();

        bike.accelerate();
        bike.breakVehicle();

        //A classe Bike não implementou o método repairVehicle por se tratar de um default method, sendo assim existe uma implementação
        //padrão na própria interface. Como a classe Bike não implementou este método esta implementação padrão é executada.
        bike.repairVehicle();

    }

}
