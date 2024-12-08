package Inheritance;

class Shape {

    public void area() {
        System.out.println("Displays area: ");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        super.area();
        System.out.println("Area of triangle is: " + 0.5 * l * h);
    }
} // Sngle level inheritance

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        super.area();
        super.area(l, h);
        System.out.println("Area of Equilateral Triangle is: " + 0.5 * l * h);
    }
} // Multi level inheritance

class Circle extends Shape {
    public void area(int r) {
        super.area();
        System.out.println("Area of circle is: " + (3.1416) * r * r);
    }
} // Hierarchial Inheritance

public class Inheritance {

    public static void main(String args[]) {

        Triangle s1 = new Triangle();
        s1.area(3, 4);

        EquilateralTriangle s2 = new EquilateralTriangle();
        s2.area(3, 4);

        Circle s3 = new Circle();
        s3.area(5);

    }
}
