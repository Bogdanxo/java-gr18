package Inheritance;

public class Triunghi extends Shape {

    @Override
    public void draw() {
        System.out.println("Am desenat triunghiul");
    }

    @Override
    public void erase() {
        System.out.println("Am sters triunghiul");
    }

        @Override
        public String toString() {
            return "Triunghi{" +
                    "color='" + getColor() + '\'' +
                    '}';
        }

    public void flipHorizontal(){
        System.out.println("Triunghiul l-am rotit pe orizontala");
    }
    public void flipVertical(){
        System.out.println("Triunghiul l-am rotit pe verticala");
    }
}
