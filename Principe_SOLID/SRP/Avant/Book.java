public class Book {
    private String title;
    private String author;
    private String content;
    private Lecteur lecteur; // celui qui emprunte le livre

    public Book(String title, String author, String content){
        this.title = title;
        this.author = author;
        this.content = content;
        this.lecteur = null; // pas encore emprunté
    }

    // Responsabilité 1: Gérer les données du livre

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getContent(){
        return content;
    }

    public Lecteur getLecteur(){
        return lecteur;
    }

    // Responsabilité 2: Afficher le livre

    public void printToScreen(){
        System.out.println("Title:" + title );
        System.out.println("Author:" + author );
        System.out.println("Content:" + content );
    }

    // Responsabilité 3: Sauvegarder le livre

    public void saveToDatabase(){
        System.out.println("Sauvegarde du livre '" + title + "' en base de données");
    }

    public void emprunter(Lecteur lecteur){
        if(this.lecteur == null){
            this.lecteur = lecteur;
            System.out.println("Emprunt du livre '" + title + "' par " + lecteur.getNom_lecteur());
        } else {
            System.out.println("Le livre '" + title + "' est déjà emprunté par " + this.lecteur.getNom_lecteur()); // Car un livre ne peut etre emprunté par un lecteur a la fois.
        }
    }
}
