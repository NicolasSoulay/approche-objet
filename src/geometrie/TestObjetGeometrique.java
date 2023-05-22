package geometrie;

public class TestObjetGeometrique {
    public static void main(String[] args){
        ObjetGeometrique[] mesObjets = {new Cercle(), new Rectangle()};

        for (ObjetGeometrique objet : mesObjets) {
            System.out.println(objet.perimetre());
            System.out.println(objet.surface());
        }
    }
}
