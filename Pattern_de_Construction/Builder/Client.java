package Pattern_de_Construction.Builder;

public class Client {
    public static void main(String[] args) {

        
        MonteurPizza monteurReine = new MonteurPizzaReine();
        Directeur directeurReine = new Directeur(monteurReine);
        Pizza pizzaReine = directeurReine.construire();
        System.out.println("Pizza Reine :");
        pizzaReine.print();

        System.out.println("\n");

        
        MonteurPizza monteurPiquante = new MonteurPizzaPiquante();
        Directeur directeurPiquante = new Directeur(monteurPiquante);
        Pizza pizzaPiquante = directeurPiquante.construire();
        System.out.println("Pizza Piquante :");
        pizzaPiquante.print();
    }
}
