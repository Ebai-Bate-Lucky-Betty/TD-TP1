package Design_Patterns.Pattern_de_structuration.Decorator;

public class FenetreSimple extends Fenetre {

    @Override
    public void dessiner() {
        System.out.println("Dessiner une fenetre simple");
    }

    @Override
    public void decrire() {
        System.out.println("Fenetre simple affichant du texte");
    }
}
