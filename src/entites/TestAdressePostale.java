package entites;

public class TestAdressePostale {
    public static void main (String[] args) {
        AdressePostale monAdresse = new AdressePostale(190, "rue Fra Angelico", 34000, "Montpellier");
        AdressePostale monAutreAdresse = new AdressePostale(16, "rue des Sablons", 34300, "Le Grau D'Agde");

        System.out.println(monAdresse.numeroDeRue+" "+monAdresse.libelle+" "+monAdresse.codePostal+" "+monAdresse.ville);
        System.out.println(monAutreAdresse.numeroDeRue+" "+monAutreAdresse.libelle+" "+monAutreAdresse.codePostal+" "+monAutreAdresse.ville);
    }
}
