package Shapes;

class Triangle {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea() {
        // Using Heron's formula to calculate the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public void displayInfo() {
        System.out.println("Triangle - Side1: " + side1 + ", Side2: " + side2 + ", Side3: " + side3);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

