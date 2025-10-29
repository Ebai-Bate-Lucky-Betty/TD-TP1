public class Main {
    public static void main(String[] args) {
        Shape s1 = new Square(4);
        Shape s2 = new Rectangle(5,4);
        System.out.println("Square area = " + s1.getArea());    //Doit obtenir 16
        System.out.println("Rectangle area = " + s2.getArea()); // Doit obtenir 20
    }
}
