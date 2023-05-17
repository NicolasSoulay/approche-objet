package fr.diginamic.banque.entites;

public class Debit extends Operation{
    public Debit(String nvDate, int nvMontant) {
        super(nvDate, nvMontant);
    }

    @Override
    public String getType() {
        return "DEBIT";
    }
}
