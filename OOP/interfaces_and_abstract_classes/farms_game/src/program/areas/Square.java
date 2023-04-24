package program.areas;

import program.interfaces.Farm;

public class Square implements Farm {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
