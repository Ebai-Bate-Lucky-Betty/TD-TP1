package Design_Patterns.Pattern_de_structuration.Composite;

public class FichierTxt extends ElementSystemeFichier {

    public FichierTxt(String nom) {
        super(nom, "txt");
    }

    @Override
    public void decrire() {
        System.out.println("Fichier : " + nom + " | Type : " + type);
    }
}