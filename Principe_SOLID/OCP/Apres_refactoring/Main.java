public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(4, 3);
        Shape circ = new Circle(2);
        RefactoredAreaCalculator2 calc = new RefactoredAreaCalculator2();

        System.out.println("Rectangle area = " + calc.calculateArea(rect));
        System.out.println("Circle area = " + calc.calculateArea(circ));
    }
}
