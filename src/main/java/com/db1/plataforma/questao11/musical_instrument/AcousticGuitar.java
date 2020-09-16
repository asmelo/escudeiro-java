package com.db1.plataforma.questao11.musical_instrument;

import java.math.BigDecimal;

public class AcousticGuitar extends MusicalInstrument  {

    private String wood;

    public AcousticGuitar(String brand, BigDecimal price, String wood) {
        //Através da palavra reservada super podemos executar o construtor da classe pai
        super(brand, price);

        //Através da palavra reservada this podemos acessar o contexto da instância do objeto.
        this.wood = wood;
    }

    @Override
    public void playInstrument() {
        System.out.println("Soando cordas do violão acústico");
    }

    @Override
    public String toString() {
        //Através da palavra reservada super podemos acessar métodos ou variáveis da classe pai
        return "AcousticGuitar{" +
                "brand='" + super.getBrand() + '\'' +
                "price='" + super.getPrice() + '\'' +
                "wood='" + wood + '\'' +
                '}';
    }
}
