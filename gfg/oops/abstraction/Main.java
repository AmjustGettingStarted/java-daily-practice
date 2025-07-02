/*
 * 🎯 Problem: Abstraction in Java
 * 
 * Implement the following classes to understand abstraction:
 *
 * ➤ Abstract Class: Shape
 *    - Data member: color (String)
 *    - Constructor: Shape(String c) → assigns c to color
 *    - Methods:
 *        → getColor() → returns the color
 *        → getArea() → abstract method with double return type
 *
 * ➤ Subclass: Square (extends Shape)
 *    - Data member: side (double)
 *    - Constructor: Square(String c, double side) → calls super(c), sets side
 *    - Method:
 *        → getArea() → returns side × side
 *
 * 📌 Note: Driver class will create instances and display outputs.
 */

abstract class Shape {
    String color;

    Shape(String c) {
        this.color = c;
    }

    String getColor() {
        return color;
    }

    abstract double getArea();
}

class Square extends Shape {
    double side;

    Square(String c, double side) {
        super(c);
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square("Red", 5.0);
        System.out.println(square.getColor());  // Output: Red
        System.out.println(square.getArea());   // Output: 25.0
    }
}
