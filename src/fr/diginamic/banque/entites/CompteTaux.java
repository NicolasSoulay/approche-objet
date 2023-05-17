package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
    float taux;
    public CompteTaux(int nvNum, int nvSolde, float nvTaux) {
        super(nvNum, nvSolde);
        taux = nvTaux;
    }

    @Override
    public String toString() {
        return super.toString()+", taux du compte: "+this.taux+"%";
    }
}
