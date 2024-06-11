package Beer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Beer beer1 = new Beer("Heineken", 3.5, 40);
        Beer beer2 = new Beer("Carlsberg", 3.5, 24);
        Beer beer3 = new Beer("Tuborg", 3.5, 42);


        System.out.println(beer1);
        System.out.println(beer2);
        System.out.println(beer3);

        ArrayList<Beer> ølListe = new ArrayList<>();
        ølListe.add(beer1);
        ølListe.add(beer2);
        ølListe.add(beer3);

        double gennemsnitsPris = 0;
        double totalPris= 0;
        for (Beer beer : ølListe) {
            totalPris += beer.getPrice();
            gennemsnitsPris = totalPris/ølListe.size();
        }

        System.out.println("Gennemsnitsprisen for alle øl er: " + gennemsnitsPris);





    }
}
