package maps;

import listes.Ville;

import java.util.HashMap;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Ville> villes = new HashMap<String, Ville>();
        villes.put("Nice" ,(new Ville("Nice", 343000)));
        villes.put("Carcassonne",(new Ville("Carcassonne", 47800)));
        villes.put("Narbonne",(new Ville("Narbonne", 53400)));
        villes.put("Lyon",(new Ville("Lyon", 484000)));
        villes.put("Foix",(new Ville("Foix", 9700)));
        villes.put("Pau",(new Ville("Pau", 77200)));
        villes.put("Marseille",(new Ville("Marseille", 850700)));
        villes.put("Tarbes",(new Ville("Tarbes", 40600)));

        int plusPetit = 999999999;
        String plusPetiteVille = "";
        for (Ville ville : villes.values()) {
            if (ville.nbrHabitants < plusPetit) {
                plusPetit = ville.nbrHabitants;
                plusPetiteVille = ville.nom;
            }
        }
        System.out.println("Plus petite ville: "+plusPetiteVille+". il reste: ");
        villes.remove("Foix");
        for (String ville : villes.keySet()){
            System.out.println(ville);
        }
    }
}
