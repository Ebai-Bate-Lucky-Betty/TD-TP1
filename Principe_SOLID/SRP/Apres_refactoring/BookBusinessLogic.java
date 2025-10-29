public class BookBusinessLogic {

    public void emprunter(BookSRP book, Lecteur lecteur){
        if (book.getLecteur() == null) {
            book.setLecteur(lecteur);
            System.out.println("Le livre '" + book.getTitle() + "' a été emprunté par " + lecteur.getNom_lecteur());
        } else {
            System.out.println("Le livre '" + book.getTitle() + "' est déjà emprunté par " + book.getLecteur().getNom_lecteur());
        }
    }

    public void retourner(BookSRP book){
        if (book.getLecteur() != null) {
            System.out.println("Le livre '" + book.getTitle() + "' a été retourné par " + book.getLecteur().getNom_lecteur());
            book.setLecteur(null);
        } else {
            System.out.println("Le livre '" + book.getTitle() + "' n'est pas emprunté.");
        }
    }
}
