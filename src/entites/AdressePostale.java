package entites;

public class AdressePostale {
    int numeroDeRue;
    String libelle;
    int codePostal;
    String ville;

    AdressePostale(int nvNum, String nvLibelle, int nvCP, String nvVille) {
        numeroDeRue = nvNum;
        libelle = nvLibelle;
        codePostal = nvCP;
        ville = nvVille;
    }
}
