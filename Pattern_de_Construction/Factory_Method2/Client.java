package Pattern_de_Construction.Factory_Method2;


public class Client {
    public static void main(String[] args) {
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();
        ProduitFactory produitFactory3 = new ProduitFactory3();

        ProduitA produitA = null;

        System.out.println("Utilisation de la premiere fabrique");
        produitA = produitFactory1.geProduitA();
        produitA.methodeA();
        
        System.out.println("\nUtilisation de la seconde fabrique");
        produitA = produitFactory2.geProduitA();
        produitA.methodeA();

        System.out.println("\nUtilisation de la troisieme fabrique");
        produitA = produitFactory3.geProduitA();
        produitA.methodeA();
    }
    
}
