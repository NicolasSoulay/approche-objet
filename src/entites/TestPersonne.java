package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main (String[] args) {
        Personne jm = new Personne("Jean-Michel", "Java", new AdressePostale(100, "rue du java", 34000, "Montpellier"));
        Personne ej = new Personne("Eric", "Js", new AdressePostale(16, "rue de pepito", 34300, "Agde"));
        System.out.println(jm.nom+" "+jm.prenom+" "+jm.adressePostale.numeroDeRue+" "+jm.adressePostale.libelle+" "+jm.adressePostale.codePostal+" "+jm.adressePostale.ville);
        System.out.println(ej.nom+" "+ej.prenom+" "+ej.adressePostale.numeroDeRue+" "+ej.adressePostale.libelle+" "+ej.adressePostale.codePostal+" "+ej.adressePostale.ville);
    }
}
