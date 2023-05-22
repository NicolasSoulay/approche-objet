package geometrie;

public class Cercle implements ObjetGeometrique {

    public double rayon = 8;

    @Override
    public double perimetre() {
        return 3.14*2*this.rayon;
    }

    @Override
    public double surface() {
        return 3.14*rayon*rayon;
    }
}
