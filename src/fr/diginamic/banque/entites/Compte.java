package fr.diginamic.banque.entites;

public class Compte{


    public int numeroCompte;
    public int solde;

    public Compte(int nvNum, int nvSolde) {
        numeroCompte = nvNum;
        solde = nvSolde;
    }

    @Override
    public String toString() {
        return "Numéro de compte: "+this.numeroCompte+" solde du compte: "+this.solde+" €";
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public Compte setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
        return this;
    }

    public int getSolde() {
        return solde;
    }

    public Compte setSolde(int solde) {
        this.solde = solde;
        return this;
    }
}
