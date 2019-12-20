public class Circle {
    double radius;
    String color;
    public static final double PI = 3.14; //daca PI e double toate calculele care implica PI sunt "double"

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
        public double getAria() { return PI * radius * radius; }
        public double getPerimeter() { return 2 * PI * radius; }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
