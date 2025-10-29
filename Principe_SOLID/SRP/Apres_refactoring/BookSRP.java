public class BookSRP {
    private String title;
    private String author;
    private String content;
    private Lecteur lecteur; // le lecteur qui a emprunté ce livre

    public BookSRP(String title, String author, String content){
        this.title = title;
        this.author = author;
        this.content = content;
        this.lecteur = null;
    }

    // Donnés sur le livre
    public String getTitle(){ 
        return title; }

    public String getAuthor(){ 
        return author; }

    public String getContent(){ 
        return content; }

    public Lecteur getLecteur(){ 
        return lecteur; }
    
    public void setLecteur(Lecteur lecteur) { // ne brise par le prinicipe SRP car il fait partie de l'état interne du livre
        this.lecteur = lecteur;
    }

}
