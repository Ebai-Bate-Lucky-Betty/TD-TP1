package Design_Patterns.Pattern_de_structuration.Adapter;

public class Client {
    public static void main(String[] args) {
        Carre carre = new AdapteRectangle(5);

        System.out.println("Périmètre : " + carre.perimetre());
        System.out.println("\n");
        System.out.println("Aire : " + carre.aire());
    }
}
