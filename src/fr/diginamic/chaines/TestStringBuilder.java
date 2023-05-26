package fr.diginamic.chaines;

import static java.lang.String.valueOf;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder monStringBuilder = new StringBuilder();
        long debut = System.currentTimeMillis();
        for (int i=0; i<99999; i++) {
            monStringBuilder.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

        long debut2 = System.currentTimeMillis();
        String monString = new String();
        for (int i=0; i<99999; i++) {
            monString+=valueOf(i);
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin2 - debut2));
    }
}
