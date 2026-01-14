package Design_Patterns.Pattern_de_Construction.Factory_Method2;

public abstract class ProduitFactory{
    public ProduitA geProduitA(){
        return createProduitA();
    }

    protected abstract ProduitA createProduitA();
}
