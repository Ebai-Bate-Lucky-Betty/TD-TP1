public class BookSaver{

    public void saveToDatabase(BookSRP book){
        System.out.println("Sauvegarde du livre '" + book.getTitle() + "' dans la base de données...");
    }

    public void saveToFile(BookSRP book, String filename){
        System.out.println("Sauvegarde du livre '" + book.getTitle() + "' dans le fichier " + filename); // simulation de sauvegarde dans un fichier
    }
}
