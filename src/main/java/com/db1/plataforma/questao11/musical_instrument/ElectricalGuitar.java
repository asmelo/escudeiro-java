package com.db1.plataforma.questao11.musical_instrument;

import java.math.BigDecimal;

public class ElectricalGuitar extends MusicalInstrument {

    private String guitarPickup;

    public ElectricalGuitar(String brand, BigDecimal price, String guitarPickup) {
        //Através da palavra reservada super podemos executar o construtor da classe pai
        super(brand, price);

        //Através da palavra reservada this podemos acessar o contexto da instância do objeto.
        this.guitarPickup = guitarPickup;
    }

    @Override
    public void playInstrument() {
        System.out.println("Soando cordas da guitarra elétrica");
    }

    @Override
    public String toString() {
        //Através da palavra reservada super podemos acessar métodos ou variáveis da classe pai
        return "ElectricalGuitar{" +
                "brand='" + super.getBrand() + '\'' +
                "price='" + super.getPrice() + '\'' +
                "guitarPickup='" + guitarPickup + '\'' +
                '}';
    }
}
