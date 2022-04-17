package lt.bit;

import lt.bit.second.Studentas;
import lt.bit.second.Universitetas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Studentas pirmasStudentas = new Studentas("st1", 2, "Adresas", "LT13123");
        Studentas antrasStudentas = new Studentas("st2", 3, "Adresas2", "LT6345345");
        Studentas treciasStudentas = new Studentas("st3", 4, "Adresas3", "LT12325");

        ArrayList<Studentas> studentai = new ArrayList<>();
        studentai.add(pirmasStudentas);
        studentai.add(antrasStudentas);
        studentai.add(treciasStudentas);

        Universitetas universitetas =
                new Universitetas("un1", "Adresas", "+3769", studentai);

        ArrayList<Studentas> universitetoStudentai = universitetas.getStudentai();


//        for(int i = 0; i < universitetoStudentai.size(); i++){
//            System.out.println(universitetoStudentai.get(i));
//        }
// Prefer šitą variantą, nes nėra i kintamojo
        for(Studentas universitetoStudentas : universitetoStudentai){
            System.out.println(universitetoStudentas);
        }

//  More fancy su lambda (tiesiog parodžiau, nebūtina dabar mokėti ir suprasti
//        universitetoStudentai.forEach(studentas -> System.out.println(studentas));

        // HashSet -> Tik unikalios reikmes saugomos. (nebus pasikartojančių elementų

        int[] skaiciai = {10, 10, 23, 23123, 123, 324, 10, 23, 324};
        HashSet<Integer> skaiciaiBeDublikato = new HashSet<>();

        for(int skaicius : skaiciai){
            if(skaiciaiBeDublikato.add(skaicius)){
                System.out.println("Yey, pridėjom į HashSeta: " + skaicius);
            } else {
                System.out.println("Rastas dublikatas: " + skaicius);
            }
        }

        for(Integer skaicius : skaiciaiBeDublikato){
            System.out.println(skaicius);
        }

        HashMap<String, Studentas> studentoInformacija = new HashMap<>();
        studentoInformacija.put("3960201312312", pirmasStudentas);
        studentoInformacija.put("13123123123", antrasStudentas);
        studentoInformacija.put("3960201312312", treciasStudentas);

        System.out.println("Asmens kodas: 3960201312312, informacija: " + studentoInformacija.get("3960201312312"));
    }
}
