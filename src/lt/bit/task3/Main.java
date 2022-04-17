package lt.bit.task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Knyga antraKnyga = new Knyga("Albertas", "Pavadinimas2", 2000, "CD1", "Azuolas", 78);
        Knyga pirmaKnyga = new Knyga("Albertas", "Pavadinimas1", 1996, "CD1", "Azuolas", 78);
        Knyga treciaKnyga = new Knyga("Cvidoras", "Pavadinimas3", 1996, "CD1", "Leidykla", 78);
        Knyga ketvirtaKnyga = new Knyga("Benas", "Pavadinimas4", 1996, "CD1", "Leidykla", 78);
        Knyga penktaKnyga = new Knyga("Donaldas", "Pavadinimas1", 1996, "CD1", "Leidykla", 78);

        ArrayList<Knyga> knygos = new ArrayList<>();
        knygos.add(pirmaKnyga);
        knygos.add(antraKnyga);
        knygos.add(treciaKnyga);
        knygos.add(ketvirtaKnyga);
        knygos.add(penktaKnyga);

        Biblioteka biblioteka = new Biblioteka(knygos);

        biblioteka.getKnyguKiekisIrVidPuslapiuSkaicius("Albertas");
        biblioteka.paieskaPagalAutoriuIrKnygosKoda("Donaldas", "CD1");
        biblioteka.paieska("Benas", "CD1", "Leidykla", 1996);
        biblioteka.knyguSarasoRikiavimasPagalPasirenktaLeidykla("Azuolas");
    }
}
