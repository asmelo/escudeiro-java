package com.db1.plataforma.questao11;

import com.db1.plataforma.questao11.musical_instrument.AcousticGuitar;
import com.db1.plataforma.questao11.musical_instrument.ElectricalGuitar;
import com.db1.plataforma.questao11.musical_instrument.MusicalInstrument;

import java.math.BigDecimal;

public class ReusingObjectBehavior {

    public static void main(String[] args) {

        //Reaproveitamento de comportamentos de um objeto por meio da herança

        MusicalInstrument acousticGuitar = new AcousticGuitar("Takamine", new BigDecimal(2000), "Rosewood");
        MusicalInstrument electricalGuitar = new ElectricalGuitar("Fender", new BigDecimal(1700), "DiMarzio");

        //Os comportamento initializingIntrumentUsage e protectInstrument são reaproveitados na classe abstrata MusicalInstrument
        //uma vez que são comportamentos comuns a todos os instrumentos musicais

        acousticGuitar.initializingIntrumentUsage();
        acousticGuitar.playInstrument();
        acousticGuitar.protectInstrument();

        System.out.println();

        electricalGuitar.initializingIntrumentUsage();
        electricalGuitar.playInstrument();
        electricalGuitar.protectInstrument();

    }

}
