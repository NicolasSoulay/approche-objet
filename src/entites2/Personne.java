package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adressePostale;
    public Personne(String nvNom, String nvPrenom, AdressePostale nvAdresse) {
        nom = nvNom;
        prenom = nvPrenom;
        adressePostale = nvAdresse;
    }
}
