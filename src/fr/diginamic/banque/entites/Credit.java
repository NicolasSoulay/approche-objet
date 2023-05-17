package fr.diginamic.banque.entites;

public class Credit extends Operation{
    public Credit(String nvDate, int nvMontant) {
        super(nvDate, nvMontant);
    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}
