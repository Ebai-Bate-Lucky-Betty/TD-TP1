package Design_Patterns.Pattern_de_structuration.Composite;

public class FichierPdf extends ElementSystemeFichier {

    public FichierPdf(String nom) {
        super(nom, "pdf");
    }

    @Override
    public void decrire() {
        System.out.println("Fichier : " + nom + " | Type : " + type);
    }
}