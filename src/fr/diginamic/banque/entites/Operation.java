package fr.diginamic.banque.entites;

public abstract class Operation {
    String date;
    int montant;

    public Operation(String nvDate, int nvMontant) {
        date = nvDate;
        montant = nvMontant;
    }

    public String getDate() {
        return date;
    }

    public Operation setDate(String date) {
        this.date = date;
        return this;
    }

    public int getMontant() {
        return montant;
    }

    public Operation setMontant(int montant) {
        this.montant = montant;
        return this;
    }

    public abstract String getType();
}
