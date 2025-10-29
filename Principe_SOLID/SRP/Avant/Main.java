public class Main {
    public static void main(String[] args) {
        Lecteur lecteur1 = new Lecteur("21T2336", "Ebai Betty");
        Lecteur lecteur2 = new Lecteur("21T2333", "Marcial");

        Book book1 = new Book("Les prinicipes SOLID", "Etudiants de M1-GL", "Révision des principes SOLID");
        
        // Afficher et sauvegarder
        System.out.println("\n");
        
        book1.printToScreen();

        System.out.println("\n");

        book1.saveToDatabase();

        // Emprunts
        book1.emprunter(lecteur2);

        System.out.println("\n");

        book1.emprunter(lecteur1);// Test: déjà emprunté
        

    }
}
