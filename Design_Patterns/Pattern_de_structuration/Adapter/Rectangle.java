package Design_Patterns.Pattern_de_structuration.Adapter;

public class Rectangle {
    private float longeur;
    private float largeur;

    public void setLongeur(float longeur){
        this.longeur = longeur;
    }

    public void setLargeur(float largeur){
        this.largeur = largeur;
    }

    public float perimetre(){
        return (2*(longeur+largeur));
    }
    public float aire(){
        return (longeur*largeur);
    }
    
}
