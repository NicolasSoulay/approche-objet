package sets;

import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> mesStrings = new HashSet<String>();
        mesStrings.add("USA");
        mesStrings.add("France");
        mesStrings.add("Allemagne");
        mesStrings.add("UK");
        mesStrings.add("Italie");
        mesStrings.add("Japon");
        mesStrings.add("Chine");
        mesStrings.add("Russie");
        mesStrings.add("Inde");

        int a = 0;
        String plusGrandString = "";
        for (String monString : mesStrings) {
            if (monString.length()>a) {
              plusGrandString=monString;
              a = monString.length();
            }
        }
        mesStrings.remove(plusGrandString);
        System.out.println(mesStrings);
    }
}
