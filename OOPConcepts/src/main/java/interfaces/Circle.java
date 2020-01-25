package interfaces;

public class Circle implements IShape {
    private double raza;
    public static final double PI = 3.14;

    public Circle(double raza) {
        this.raza = raza;
    }

    @Override
    public void draw() {
        System.out.println("drawing the circle");
    }

    @Override
    public double displayArea() {
        return PI * raza * raza;
    }
}
