package aggregation;

public class Motor {
    private int putere;
    private double capacitate;

    public Motor() {
        this.capacitate = 0.8;
        this.putere = 75;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        if (capacitate < 0) {
            System.out.println("Nu puteti introduce o valoare mai mica decat 75 pentru putere");
        } else {
            this.putere = putere;
        }
    }

    public double getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(double capacitate) {
        if (capacitate < 0) {
            System.out.println("Nu puteti introduce o valoare mai mica decat 0.8 pentru capacitate");
        } else {
            this.capacitate = capacitate;
        }
    }
}