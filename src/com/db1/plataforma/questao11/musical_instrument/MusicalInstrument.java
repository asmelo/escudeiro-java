package com.db1.plataforma.questao11.musical_instrument;

import java.math.BigDecimal;

//Classe abstrata - Todos os instrumentos musicais deverão estender desta classe afim de herdar todos os métodos concretos e serem
//obrigados a implementar os métodos abstratos
//Uma classe abstrata não pode ser instanciada apenas estendida
public abstract class MusicalInstrument {

    private String brand;
    private BigDecimal price;

    public MusicalInstrument(String brand, BigDecimal price) {
        this.brand = brand;
        this.price = price;
    }

    public void initializingIntrumentUsage() {
        System.out.println("Retirando instrumento do case para utilizá-lo");
    }

    public void protectInstrument() {
        System.out.println("Guardando o instrumento musical no case para sua proteção");
    }

    //Método abstrato - Todas as classes que estenderem de MusicalInstrumento deverão implementar um método playInstrumento
    public abstract void playInstrument();

    public String getBrand() {
        return brand;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
