abstract class Shape {
    abstract int numberOfSides();
}

class Rectangle extends Shape {
    @Override
    int numberOfSides() {
        return 4;
    }
}

class Triangle extends Shape {
    @Override
    int numberOfSides() {
        return 3;
    }
}

class Hexagon extends Shape {
    @Override
    int numberOfSides() {
        return 6;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();

        System.out.println("Rectangle has " + rectangle.numberOfSides() + " sides.");
        System.out.println("Triangle has " + triangle.numberOfSides() + " sides.");
        System.out.println("Hexagon has " + hexagon.numberOfSides() + " sides.");
    }
}
