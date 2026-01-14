package Design_Patterns.Pattern_de_structuration.Adapter;

public class AdapteRectangle implements Carre {

    Rectangle monRect;

    public AdapteRectangle(float cote){
        monRect = new Rectangle();
        monRect.setLargeur(cote);
        monRect.setLongeur(cote);
    }

    @Override
    public float perimetre(){
        return monRect.perimetre();
    }

    @Override
    public float aire(){
        return monRect.aire();
    }
    
}

    

