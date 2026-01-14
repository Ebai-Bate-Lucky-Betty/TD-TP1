package Design_Patterns.Pattern_de_Construction.Abstract_Factory;

public class ProduitFactory1 implements IProduitFactory {
    public ProduitA getProduitA() {
        return new ProduitA1();
    }
    public ProduitB getProduitB() {
        return new ProduitB1();
    }
}