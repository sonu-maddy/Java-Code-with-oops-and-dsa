package sonu.com.designPrinciple;


// Product
interface Shape {
    void draw();
}

// Different products
class Circle implements Shape {
    public void draw() { System.out.println("Drawing Circle"); }
}
class Square implements Shape {
    public void draw() { System.out.println("Drawing Square"); }
}

// Factory class
class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) return new Circle();
        if (type.equalsIgnoreCase("square")) return new Square();
        return null;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.getShape("circle");
        s1.draw(); // Drawing Circle

        Shape s2 = factory.getShape("square");
        s2.draw(); // Drawing Square
    }
}
