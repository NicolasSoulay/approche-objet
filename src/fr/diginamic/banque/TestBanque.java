package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte monCompte = new Compte(1, 1000);

        System.out.println("Numéro du compte: "+monCompte.numeroCompte+" Solde du compte: "+monCompte.solde+" €");
    }
}
