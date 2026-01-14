package Design_Patterns.Pattern_de_structuration.Composite;

public class Client {
    public static void main(String[] args) {

        Dossier racine = new Dossier("Racine");

        Dossier cours = new Dossier("Cours");
        Dossier examens = new Dossier("Examens");

        FichierTxt fichier1 = new FichierTxt("intro_java");
        FichierPdf fichier2 = new FichierPdf("design_patterns");

        cours.ajouter(fichier1);
        examens.ajouter(fichier2);

        racine.ajouter(cours);
        racine.ajouter(examens);

        racine.decrire();
    }
}