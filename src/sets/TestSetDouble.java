package sets;

import java.util.HashSet;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> monSet = new HashSet<Double>();
        monSet.add(1.5);
        monSet.add(8.25);
        monSet.add(-7.32);
        monSet.add(13.3);
        monSet.add(12.45);
        monSet.add(48.5);
        monSet.add(0.01);
        System.out.println(monSet);

        double a = 0;
        for (Double unDouble : monSet) {
           if (a<unDouble) {
               a=unDouble;
           }
        }
        System.out.println(a);

        for (Double unDouble : monSet) {
            if (a>unDouble) {
                a=unDouble;
            }
        }
        monSet.remove(a);
        System.out.println(monSet);
    }
}
