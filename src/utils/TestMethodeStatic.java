package utils;

import static java.lang.Integer.compare;
import static java.lang.Integer.valueOf;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String monString = "12";
        int monInt = valueOf(monString);
        System.out.println(monInt);

        int a = 1;
        int b = 2;
        int dif = compare(b, a);

        System.out.println(dif);
    }
}
