public class Main {
    public static void main(String[] args) {

        Lecteur lecteur1 = new Lecteur("21T2336", "Ebai Betty");
        BookSRP book1 = new BookSRP("Les prinicipes SOLID", "Etudiants de M1-GL", "Révision des principes SOLID");
        BookSRP book2 = new BookSRP("Principe SRP", "Hannah Louise", "Se principe est...");

        // Services
        BookPrinter printer = new BookPrinter();
        BookSaver repo = new BookSaver();
        BookBusinessLogic BookBusinessLogic = new BookBusinessLogic();

        // Actions
        printer.printToScreen(book1);
        System.out.println("\n");
        printer.printToHTML(book2);

        System.out.println("\n");
        BookBusinessLogic.emprunter(book1, lecteur1);
        System.out.println("\n");
        BookBusinessLogic.emprunter(book2, lecteur1);

        System.out.println("\n");
        repo.saveToDatabase(book1);
        System.out.println("\n");
        repo.saveToFile(book2, "Devoir");

        System.out.println("\n");
        BookBusinessLogic.retourner(book1);
        System.out.println("\n");
        printer.printToScreen(book1);
    }
}
