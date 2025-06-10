package SOLID;

public class OCP_02 {

    public static abstract class Shape {
        public abstract double area();
    }

    public static class Square extends Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double area() {
            return side * side;
        }
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    public static class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double area() {
            return width * height;
        }
    }

    public static class AreaCalculator {
        public double getArea(Shape shape) {
            return shape.area();
        }
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Shape square = new Square(4);
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(5, 2);

        System.out.println("Square Area: " + calculator.getArea(square));
        System.out.println("Circle Area: " + calculator.getArea(circle));
        System.out.println("Rectangle Area: " + calculator.getArea(rectangle));
    }
}
