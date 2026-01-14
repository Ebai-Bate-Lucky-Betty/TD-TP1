package Design_Patterns.Pattern_de_Construction.Abstract_Factory;

 public class Client {
    public static void main(String[] args) {
        IProduitFactory produitFactory1 = new ProduitFactory1();
        IProduitFactory produitFactory2 = new ProduitFactory2();
        
        ProduitA produitA = null;
        ProduitB produitB = null;
        System.out.println("Utilisation de la premiere fabrique");
        System.out.println("\n");
        produitA = produitFactory1.getProduitA();
        produitB = produitFactory1.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
        System.out.println("\n");
        System.out.println("Utilisation de la seconde fabrique");
        System.out.println("\n");
        produitA = produitFactory2.getProduitA();
        produitB = produitFactory2.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
    }
}
