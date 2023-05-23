package sets;

import java.util.HashSet;

public class Pays {
    public String nom;
    public int nbrHabitants;
    public Double pibHabitant;

    public Pays(String nvNom, int nvNbrHabitants, Double nvPibHabitant) {
        nom = nvNom;
        nbrHabitants= nvNbrHabitants;
        pibHabitant = nvPibHabitant;
    }
    public static void main(String[] args) {
        HashSet<Pays> mesPays = new HashSet<Pays>();
        mesPays.add(new Pays("USA",339996563,25346.805));
        mesPays.add(new Pays("France",64756584,3013.005));
        mesPays.add(new Pays("Allemagne",83294633,4256.540));
        mesPays.add(new Pays("UK",67736802,3376.003));
        mesPays.add(new Pays("Italie",85870762,2058.003));
        mesPays.add(new Pays("Japon",123294513,4912.147));
        mesPays.add(new Pays("Chine",1425671352,19911.059));
        mesPays.add(new Pays("Russie",144444359,1829.050));
        mesPays.add(new Pays("Inde",1428627663,3534.743));

        String a = "";
        Double b = 0.0;
        for (Pays monPays : mesPays) {
            if (monPays.pibHabitant>b) {
                b = monPays.pibHabitant;
                a = monPays.nom;
            }
        }
        for (Pays monPays : mesPays) {
            if (monPays.nom == a) {
                System.out.println(monPays.nom+" est le pays avec le PIB/habitant le plus important: "+monPays.pibHabitant);
            }
        }

        Double c = 0.0;
        for (Pays monPays : mesPays) {
            if (monPays.pibHabitant* monPays.nbrHabitants>c) {
                c = monPays.pibHabitant* monPays.nbrHabitants;
                a = monPays.nom;
            }
        }
        for (Pays monPays : mesPays) {
            if (monPays.nom == a) {
                System.out.println(monPays.nom+" est le pays avec le PIB total le plus important: "+monPays.pibHabitant* monPays.nbrHabitants);
            }
        }

        for (Pays monPays : mesPays) {
            if (monPays.pibHabitant* monPays.nbrHabitants<c) {
                c = monPays.pibHabitant* monPays.nbrHabitants;
                a = monPays.nom;
            }
        }
        for (Pays monPays : mesPays) {
            if (monPays.nom == a) {
                monPays.nom = monPays.nom.toUpperCase();
            }
            System.out.println(monPays.nom);
        }
        mesPays.remove(a);

        for (Pays monPays : mesPays) {
            System.out.println("Nom: "+monPays.nom+" habitants: "+ monPays.nbrHabitants+" PIB total: "+monPays.nbrHabitants* monPays.pibHabitant);
        }
    }
}
