public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4); // Attend une aire de 20
        System.out.println("Aire du Rectagle = " + rectangle.getArea()); 

        Rectangle squareAsRectangle = new Square();
        squareAsRectangle.setWidth(5);
        squareAsRectangle.setHeight(4);  // Attend une aire de 20, mais obtient 16 (4x4)
        System.out.println("\n Aire du Carré  = " + squareAsRectangle.getArea()); 
    }
}
