package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String [] args) {
        Calendar monCal = Calendar.getInstance();
        monCal.set(2016, 5, 19, 23, 59, 30);
        Date monDate = monCal.getTime();
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        String monString = formateur.format(monDate);
        System.out.println(monString);

        Calendar monCalDuJour = Calendar.getInstance();
        Date monDateDuJour = monCalDuJour.getTime();
        SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss");
        String monString2 = formateur2.format(monDateDuJour);
        System.out.println(monString2);

        Locale FR = new Locale("fr", "FR");
        Locale RU = new Locale("ru", "RU");
        Locale CH = new Locale("ch", "CH");
        Locale AL = new Locale("de", "DE");

        SimpleDateFormat formateurFR = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss", Locale.FRENCH);
        String monStringFR = formateurFR.format(monDateDuJour);
        System.out.println(monStringFR);

        SimpleDateFormat formateurRU = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss", RU);
        String monStringRU = formateurRU.format(monDateDuJour);
        System.out.println(monStringRU);
    }
}
