package Inheritance;

public class Cerc extends Shape{

    @Override
    public void draw() {
        System.out.println("Am desenat cercul");
    }

    @Override
    public void erase() {
        System.out.println("Am sters cercul");
    }

    @Override
    public String toString() {
        return "Cerc{" +
                "color='" + getColor() + '\'' +
                '}';
    }

}
