package Pattern_de_Construction.Factory_Method2;

public class ProduitFactory1 extends ProduitFactory {
    protected ProduitA createProduitA(){
        return new ProduitA1();
    }
}
