package Design_Pattern;

public interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Inside Circle: Draw()");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Inside Square: Draw()");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Inside Rectangle: Draw()");
    }
}

class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;
        if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        return null;
    }

}

class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape s1 = factory.getShape("Square");
        s1.draw();
    }

}
