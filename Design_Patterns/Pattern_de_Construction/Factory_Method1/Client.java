package Design_Patterns.Pattern_de_Construction.Factory_Method1;

public class Client {
    public static void main(String[] args) {
        ProduitFactory produitFactory = new ProduitFactory();

        ProduitA produitA = null;

        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
        produitA.methodeA();

        System.out.println("\n");

        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
        produitA.methodeA();

        System.out.println("\n");

        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA3);
        produitA.methodeA();

        System.out.println("\n");

        produitA = produitFactory.getProduitA(4);
        produitA.methodeA();
    }
    
}
