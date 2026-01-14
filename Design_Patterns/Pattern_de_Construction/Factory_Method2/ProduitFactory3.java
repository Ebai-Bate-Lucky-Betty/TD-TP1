package Design_Patterns.Pattern_de_Construction.Factory_Method2;

public class ProduitFactory3 extends ProduitFactory {
    protected ProduitA createProduitA(){
        return new ProduitA3();
    }
}
