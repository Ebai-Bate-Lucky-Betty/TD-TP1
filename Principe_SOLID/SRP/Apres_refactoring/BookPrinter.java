public class BookPrinter {

    public void printToScreen(BookSRP book){
        System.out.println("===== Print to Screen =====");
        System.out.println("Titre: " + book.getTitle());
        System.out.println("Auteur: " + book.getAuthor());
        System.out.println("Contenu: " + book.getContent());
        if (book.getLecteur() != null) {
            System.out.println("Emprunté par: " + book.getLecteur().getNom_lecteur()); // Si jamais se livre a été emprunté
        } else {
            System.out.println("Le livre est disponible.");
        }
    }

    public void printToHTML(BookSRP book){
        System.out.println("\n===== Print to HTML =====");
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<h2>Par " + book.getAuthor() + "</h2>");
        System.out.println("<p> " + book.getContent() + "</p>");
        if (book.getLecteur() != null) {
            System.out.println("<p>Emprunté par: " + book.getLecteur().getNom_lecteur() + "</p>"); // Si jamais se livre a été emprunté
        } else {
            System.out.println("<p>Le livre est disponible.</p>");
        }
    }
}
