package Design_Patterns.Pattern_de_structuration.Bridge;

public abstract class Shape {
    
    Color color;
    Shape(Color color){
        this.color=color;
    }

    abstract public void colorIt();

}
