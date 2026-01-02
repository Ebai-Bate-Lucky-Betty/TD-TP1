package Pattern_de_Construction.Builder;

public class Directeur {

    private MonteurPizza monteurPizza;

    public Directeur(MonteurPizza monteurPizza) {
        this.monteurPizza = monteurPizza;
    }

    public Pizza construire() {
        monteurPizza.creerNouvellePizza();
        monteurPizza.monterPate();
        monteurPizza.monterSauce();
        monteurPizza.monterGarniture();
        return monteurPizza.getPizza();
    }
}
