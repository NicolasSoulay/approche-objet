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
    public void afficheNomPrenom() {
        System.out.println(nom.toUpperCase()+" "+prenom);
    }

    public Personne setNom(String nvNom) {
        this.prenom = nvNom;
        return this;
    }
    public Personne setPrenom(String nvPrenom) {
        this.prenom = nvPrenom;
        return this;
    }

    public Personne setAdresse(AdressePostale nvAdresse) {
        this.adressePostale = nvAdresse;
        return this;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public AdressePostale getAdresse() {
        return this.adressePostale;
    }
}
