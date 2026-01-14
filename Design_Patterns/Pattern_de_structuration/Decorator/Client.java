package Design_Patterns.Pattern_de_structuration.Decorator;

public class Client {

    public static void main(String[] args) {

        Fenetre fenetre = new FenetreSimple();

        System.out.println("---- Fenetre simple ----");
        fenetre.dessiner();
        fenetre.decrire();

        System.out.println("\n---- Fenetre avec curseur vertical ----");
        Fenetre fenetreVerticale =
                new DecorateurCurseurVertical(fenetre);
        fenetreVerticale.dessiner();
        fenetreVerticale.decrire();

        System.out.println("\n---- Fenetre avec curseur vertical et horizontal ----");
        Fenetre fenetreComplete =
                new DecorateurCurseurHorizontal(fenetreVerticale);
        fenetreComplete.dessiner();
        fenetreComplete.decrire();
    }
}
