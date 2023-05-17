package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main (String[] args) {
        Personne jm = new Personne("Jean-Michel", "Java", new AdressePostale(100, "rue du java", 34000, "Montpellier"));
        Personne ej = new Personne("Eric", "Js", new AdressePostale(16, "rue de pepito", 34300, "Agde"));

        System.out.println(jm.getAdresse().numeroDeRue+" "+jm.getAdresse().libelle);
        jm.setAdresse(new AdressePostale(156, "rue de je sais pas", 35490, "connaispas"));
        jm.afficheNomPrenom();
        System.out.println(jm.getAdresse().numeroDeRue+" "+jm.getAdresse().libelle);
    }
}
