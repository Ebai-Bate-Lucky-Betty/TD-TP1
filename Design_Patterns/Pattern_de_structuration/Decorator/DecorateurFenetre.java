package Design_Patterns.Pattern_de_structuration.Decorator;

public abstract class DecorateurFenetre extends Fenetre {

    protected Fenetre fenetreDecoree;

    public DecorateurFenetre(Fenetre fenetre) {
        this.fenetreDecoree = fenetre;
    }

    @Override
    public void dessiner() {
        fenetreDecoree.dessiner();
    }

    @Override
    public void decrire() {
        fenetreDecoree.decrire();
    }
}
