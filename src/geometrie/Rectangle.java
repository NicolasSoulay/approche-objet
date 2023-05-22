package geometrie;

public class Rectangle implements ObjetGeometrique{

    public double longueur=15;
    public double largeur=8;
    @Override
    public double perimetre() {
        return (longueur+largeur)*2;
    }

    @Override
    public double surface() {
        return longueur*largeur;
    }
}
