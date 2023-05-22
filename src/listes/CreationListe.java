package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> nombres = new ArrayList<Integer>() ;
        for (int i = 0; i < 100; i++) {
            nombres.add(i+1);
        }
        System.out.println(nombres.size());
    }
}
