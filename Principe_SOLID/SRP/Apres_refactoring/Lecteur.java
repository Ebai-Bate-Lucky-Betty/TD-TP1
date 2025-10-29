public class Lecteur {

    private String matricule_lecteur;
    private String nom_lecteur;

    public Lecteur(String matricule_lecteur, String nom_lecteur){
        this.matricule_lecteur = matricule_lecteur;
        this.nom_lecteur = nom_lecteur;
    }

    public String getId_lecteur() {
        return matricule_lecteur;
    }

    public String getNom_lecteur() {
        return nom_lecteur;
    }
}
