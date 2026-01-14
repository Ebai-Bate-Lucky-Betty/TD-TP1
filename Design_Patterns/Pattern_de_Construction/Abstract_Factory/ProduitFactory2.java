package Design_Patterns.Pattern_de_Construction.Abstract_Factory;

 public class ProduitFactory2 implements IProduitFactory {
    public ProduitA getProduitA() {
        return new ProduitA2();
    }
    public ProduitB getProduitB() {
        return new ProduitB2();
    }
}