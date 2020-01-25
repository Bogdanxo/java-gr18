package interfaces;


public class ShapeExample {
    public static void main(String[] args) {

        IShape cerc= new Circle(2);
        System.out.println(cerc.displayArea());

        IShape rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.displayArea());
    }
}
