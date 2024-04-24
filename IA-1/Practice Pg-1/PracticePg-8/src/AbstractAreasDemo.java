abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
    abstract double perimeter();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }

    double perimeter() {
        System.out.println("Inside Perimeter for Rectangle.");
        return 2 * (dim1 + dim2);
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }

    double perimeter() {
        // Assuming it is a right triangle for simplicity
        System.out.println("Inside Perimeter for Triangle.");
        return dim1 + dim2 + Math.sqrt(dim1 * dim1 + dim2 * dim2);
    }
}

class Circle extends Figure {
    Circle(double radius) {
        super(radius, 0);
    }

    double area() {
        System.out.println("Inside Area for Circle.");
        return Math.PI * dim1 * dim1;
    }

    double perimeter() {
        System.out.println("Inside Perimeter for Circle.");
        return 2 * Math.PI * dim1;
    }
}

class Square extends Figure {
    Square(double side) {
        super(side, side);
    }

    double area() {
        System.out.println("Inside Area for Square.");
        return dim1 * dim1;
    }

    double perimeter() {
        System.out.println("Inside Perimeter for Square.");
        return 4 * dim1;
    }
}

public class AbstractAreasDemo {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(4);
        Square s = new Square(6);

        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());
        System.out.println("Perimeter is " + figref.perimeter());

        figref = t;
        System.out.println("Area is " + figref.area());
        System.out.println("Perimeter is " + figref.perimeter());

        figref = c;
        System.out.println("Area is " + figref.area());
        System.out.println("Perimeter is " + figref.perimeter());

        figref = s;
        System.out.println("Area is " + figref.area());
        System.out.println("Perimeter is " + figref.perimeter());
    }
}
