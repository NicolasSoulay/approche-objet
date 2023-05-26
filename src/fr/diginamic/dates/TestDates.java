package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date maDate = new Date(123, 5, 26, 11,58, 30);
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        String monString = formateur.format(maDate);
        System.out.println(monString);


        Date maDate2 = new Date(116, 5, 19, 23,59, 30);
        SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String monString2 = formateur2.format(maDate2);
        System.out.println(monString2);

        Date maDate3 = new Date();
        SimpleDateFormat formateur3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String monString3 = formateur3.format(maDate3);
        System.out.println(monString3);
    }
}
