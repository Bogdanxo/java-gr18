package interfaces;

public class Rectangle implements IShape {
    private final double lungime;
    private final double latime;
    public Rectangle (double lungime, double latime) {
        this.latime = latime;
        this.lungime = lungime;
    }

    @Override
    public void draw() {
        System.out.println("The rectangle is drawing...");
    }

    @Override
    public double displayArea() {
        return lungime * latime;
    }

}
