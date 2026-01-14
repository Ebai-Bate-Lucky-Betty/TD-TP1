package Design_Patterns.Pattern_de_structuration.Composite;

public abstract class ElementSystemeFichier {

    protected String nom;
    protected String type;

    public ElementSystemeFichier(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public abstract void decrire();

    public void ajouter(ElementSystemeFichier e) {
        throw new UnsupportedOperationException();
    }

    public void supprimer(ElementSystemeFichier e) {
        throw new UnsupportedOperationException();
    }

    public ElementSystemeFichier getElement(int i) {
        throw new UnsupportedOperationException();
    }
}

