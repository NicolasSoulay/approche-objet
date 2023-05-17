package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte monCompte = new Compte(1, 1000);

        System.out.println("Numéro du compte: "+monCompte.numeroCompte+" Solde du compte: "+monCompte.solde+" €");
        System.out.println(monCompte);


        Compte[] monTableauDeComptes = {new Compte(2, 500), new CompteTaux(3, 2160, 1.4F)};

        for (Object compte : monTableauDeComptes) {
            System.out.println(compte.toString());
        }
    }
}
