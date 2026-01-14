package Design_Patterns.Pattern_de_structuration.Composite;

import java.util.ArrayList;
import java.util.List;

public class Dossier extends ElementSystemeFichier {

    private List<ElementSystemeFichier> elements = new ArrayList<>();

    public Dossier(String nom) {
        super(nom, "dossier");
    }

    @Override
    public void ajouter(ElementSystemeFichier e) {
        elements.add(e);
    }

    @Override
    public void supprimer(ElementSystemeFichier e) {
        elements.remove(e);
    }

    @Override
    public ElementSystemeFichier getElement(int i) {
        return elements.get(i);
    }

    @Override
    public void decrire() {
        System.out.println("Dossier : " + nom + " | Type : " + type);
        for (ElementSystemeFichier e : elements) {
            e.decrire();
        }
    }
}