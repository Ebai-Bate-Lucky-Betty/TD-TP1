package Design_Patterns.Pattern_de_structuration.Decorator;

public class DecorateurCurseurHorizontal extends DecorateurFenetre {

    public DecorateurCurseurHorizontal(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void dessiner() {
        super.dessiner();
        dessinerCurseurHorizontal();
    }

    @Override
    public void decrire() {
        super.decrire();
        System.out.println("Avec un curseur de defilement horizontal");
    }

    private void dessinerCurseurHorizontal() {
        System.out.println("Dessiner le curseur horizontal");
    }
}
