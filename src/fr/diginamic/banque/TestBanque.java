package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class TestBanque {
    public static void main(String[] args) {
        Compte monCompte = new Compte(1, 1000);

        System.out.println("Numéro du compte: "+monCompte.numeroCompte+" Solde du compte: "+monCompte.solde+" €");
        System.out.println(monCompte);


        Compte[] monTableauDeComptes = {new Compte(2, 500), new CompteTaux(3, 2160, 1.4F)};

        for (Compte compte : monTableauDeComptes) {
            System.out.println(compte.toString());
        }

        Operation[] monTableauxDOperations = {new Credit("10/10/2022", 200),new Credit("11/08//2022", 25),new Debit("22/04/2023", 948),new Debit("21/12/2021", 147)};

        int total = 0;
        for (Operation operations : monTableauxDOperations) {
            System.out.println("Type d'opération: "+operations.getType()+", date: "+operations.getDate()+", Montant: "+operations.getMontant()+" €");
            if (operations.getType() == "DEBIT"){
                total -= operations.getMontant();
            } else {
                total += operations.getMontant();
            }
        }
        System.out.println("Total des operations: "+total+" €");
    }
}
