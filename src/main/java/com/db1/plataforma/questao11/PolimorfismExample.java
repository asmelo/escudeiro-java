package com.db1.plataforma.questao11;

import com.db1.plataforma.questao11.vehicle.Bike;
import com.db1.plataforma.questao11.vehicle.Car;
import com.db1.plataforma.questao11.vehicle.Vehicle;

public class PolimorfismExample {

    public static void main(String[] args) {

        Vehicle vehicleOne = new Bike("Monark");
        Vehicle vehicleTwo = new Car("Siena");

        //Ao executar o método accelerate percebemos que apresenta resultados diferentes. Por conta do polimorfismo do Java é possível
        //implementar o mesmo método declarado na interface de formas diferentes. Todos os veículos precisam implementar o mesmo
        //método accelerate contudo cada um deles terá uma implementação distinta.
        vehicleOne.accelerate();
        vehicleTwo.accelerate();

    }

}
