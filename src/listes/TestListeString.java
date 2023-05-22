package listes;

import java.util.ArrayList;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> villes = new ArrayList<String>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        String a = "";

        for (String ville : villes) {
           if (a.length() < ville.length()){
                a = ville;
           }
        }
        System.out.println("la ville contenant le plus grand nombre de lettre est: "+a);

        for (int i=0; i< villes.size(); i++) {
           villes.set(i, villes.get(i).toUpperCase());
        }

        System.out.println("liste en majuscule : ");
        for (String ville : villes) {
            System.out.println(ville);
        }

        for (int i=0; i< villes.size(); i++) {
            if (villes.get(i).startsWith("N")){
                villes.remove(i);
            }
        }
        System.out.println("liste sans ville commençant par N: ");
        for (String ville : villes) {
            System.out.println(ville);
        }
    }
}
