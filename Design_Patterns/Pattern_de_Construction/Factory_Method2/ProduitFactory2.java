package Design_Patterns.Pattern_de_Construction.Factory_Method2;

public class ProduitFactory2 extends ProduitFactory {
    protected ProduitA createProduitA(){
        return new ProduitA2();
    }
}
