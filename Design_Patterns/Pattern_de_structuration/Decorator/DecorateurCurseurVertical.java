package Design_Patterns.Pattern_de_structuration.Decorator;

public class DecorateurCurseurVertical extends DecorateurFenetre {

    public DecorateurCurseurVertical(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void dessiner() {
        super.dessiner();
        dessinerCurseurVertical();
    }

    @Override
    public void decrire() {
        super.decrire();
        System.out.println("Avec un curseur de defilement vertical");
    }

    private void dessinerCurseurVertical() {
        System.out.println("Dessiner le curseur vertical");
    }
}
