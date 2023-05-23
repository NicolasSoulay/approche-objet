package listes;
import java.util.ArrayList;

public class TestVille {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<Ville>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        int a = villes.get(0).nbrHabitants;
        int b = 0;

        for (int i=0; i<villes.size(); i++ ) {
            if (villes.get(i).nbrHabitants > a) {
                a = villes.get(i).nbrHabitants;
                b = i;
            }
        }
        System.out.println("la ville la plus peuplé est: "+villes.get(b).nom);

        for (int i=0; i<villes.size(); i++ ) {
            if (villes.get(i).nbrHabitants < a) {
                a = villes.get(i).nbrHabitants;
                b = i;
            }
        }
        System.out.println("la ville supprimée est: "+villes.get(b).nom);
        villes.remove(b);

        for (int i=0; i<villes.size(); i++ ) {
            if (villes.get(i).nbrHabitants > 100000) {
                villes.get(i).nom = villes.get(i).nom.toUpperCase();
            }
        }
        for (Ville ville : villes) {
            System.out.println(ville.nom);
        }
    }
}
