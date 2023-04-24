package program.areas;

import program.abstracts.Polygon;

public class Triangle extends Polygon {

    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double area() {
        return base * height / 2.0;
    }
}
