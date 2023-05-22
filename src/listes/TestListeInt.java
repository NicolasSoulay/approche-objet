package listes;

import java.util.ArrayList;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> maListe = new ArrayList<Integer>();
        maListe.add(-1);
        maListe.add(5);
        maListe.add(7);
        maListe.add(3);
        maListe.add(-2);
        maListe.add(4);
        maListe.add(8);
        maListe.add(5);

        System.out.println("liste initial: ");
        for (int i=0; i<maListe.size(); i++) {
            System.out.println(maListe.get(i));
        }

        System.out.println("taille de la liste: "+maListe.size());

        int a = maListe.get(0);
        for (int i=0; i< maListe.size(); i++) {
            if (maListe.get(i)>a) {
                a = maListe.get(i);
            }
        }
        System.out.println("le plus grand c'est: "+a);

        int b = maListe.get(0);
        int index = 0;
        for (int i=0; i< maListe.size(); i++) {
            if (maListe.get(i)<b) {
                b = maListe.get(i);
                index = i;
            }
        }
        System.out.println("le plus petit c'est: "+maListe.get(index));
        maListe.remove(index);

        System.out.println("liste sans le plus petit: ");
        for (int i=0; i<maListe.size(); i++) {
            System.out.println(maListe.get(i));
        }

        for (int i=0; i< maListe.size(); i++) {
            if (maListe.get(i)<0) {
                maListe.set(i, maListe.get(i)*(-1));
            }
        }

        System.out.println("liste sans negatif: ");
        for (int i=0; i<maListe.size(); i++) {
            System.out.println(maListe.get(i));
        }
    }
}
