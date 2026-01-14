package Design_Patterns.Pattern_de_Construction.Singleton;

public final class Singleton {
    private static Singleton instance = null;

    private int x;
    private int y;
    private String nom;

    private Singleton(){
        super();
    }

    private Singleton(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Troisieme contructeur
    private Singleton(int x, int y, String nom){
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance(int x, int y){
        if (instance == null){
            instance = new Singleton(x, y);
        }
        return instance;
    }

    public static Singleton getInstance(int x, int y, String nom){
        if (instance == null){
            instance = new Singleton(x, y, nom);
        }
        return instance;
    }

    public int somme(int x, int y){
        return x+y;
    }

    public float moyenne(int x, int y){
        return somme(x, y)/2f;
    }

    public void affiche(){
        System.out.println("\nJe suis une instance mes valeurs sont x: " + this.x + " et y: " + this.y);
    }

    //Implementation
    public void afficheInfo(){
        System.out.println("\nJe suis: " + nom + " et j'ai: " + somme(this.x, this.y) + " ans");
    }

    //Pour pouvoir rendre le Singleton null sans quoi nous ne pourons pas faire la derniere implementation 
    public static void reset(){
    instance = null;
    }


    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

}
