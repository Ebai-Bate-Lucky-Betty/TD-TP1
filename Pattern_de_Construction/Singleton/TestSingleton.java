package Pattern_de_Construction.Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        int som = Singleton.getInstance().somme(2,5);

        System.out.printf("La somme est %d", som);

        Singleton s1 = Singleton.getInstance(8,3);
        s1.affiche(); // n'affichera rien  puisque le Singleton n'est plus null

        System.out.println("\n");

        Singleton s2 = Singleton.getInstance(5, 9);
        s2.affiche();// n'affichera rien  puisque le Singleton n'est plus null

        System.out.println("\n Implementation apres avoir rendu le Singleton null");

        Singleton.reset();

        Singleton s3 = Singleton.getInstance(9, 11, "Ebai");
        s3.afficheInfo();




    }
    
}
