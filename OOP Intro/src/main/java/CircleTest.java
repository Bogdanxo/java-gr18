public class CircleTest {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, "red");
        System.out.println("Aria obiectului circle1 este: " + circle1.getAria());
        System.out.println("Perimetrul obiectului circle1 este: " + circle1.getPerimeter());
        System.out.println("Culoarea obiectului circle1 este: " + circle1.color);

        Circle circle2 = new Circle(7.0, "green");
        System.out.println("Aria obiectului circle1 este: " + circle2.getAria());
        System.out.println("Perimetrul obiectului circle1 este: " + circle2.getPerimeter());
        System.out.println("Culoarea obiectului circle1 este: " + circle2.color);

        Circle circle3 = new Circle(8.0, "black");
        System.out.println("Aria obiectului circle1 este: " + circle1.getAria());
        System.out.println("Perimetrul obiectului circle1 este: " + circle3.getPerimeter());
        System.out.println("Culoarea obiectului circle1 este: " + circle3.color);

        Circle circle4 = new Circle(10.0, "pink");
        System.out.println("Apelare metode din Object Class");

        System.out.println(circle4.toString());

        createArrayOfCricle();

    }

    private static void createArrayOfCricle() {
        Circle[] circleArray = new Circle[10]; //cream o clasa non primitiva de dimensiunea 10 astfel populandu-l
        for (int i = 0; i <= circleArray.length - 1; i++) {
            if (i % 2 == 0) {
                Circle circleEven = new Circle(i + 1, "blue");
                circleArray[i] = circleEven;
            } else {
                Circle circleOdd = new Circle(i + 1, "green");
                circleArray[i] = circleOdd;
            }
        }
        //Afisare culori ale cercurilor din array utilizand for each
        for (Circle itemCircle : circleArray) //in dreapta arrayul si in stanga ce vrem sa alegem din array
            System.out.println(itemCircle.color); //afisam culoarea a ceea ce am ales din array
    }
}
