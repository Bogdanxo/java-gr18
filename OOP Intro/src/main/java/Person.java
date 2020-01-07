/**
 * Clasa Persoana
 */

public class Person {
    public static final double PI = 3.14;


    String name; //attribute or instance variable
    int age = 0;

    //consctructor implicit
    public Person() {
        this.age = 0;
        this.name = "no name";
        System.out.println("Constructorul implicit a fost apelat");

    }

    //Constructor explicit
    public Person(String name) {
        System.out.println("Constructor explicit cu 1 parametru a fost apelat");
        this.name = name;
        displayHello();
    }
     public void displayHello() {
        System.out.println("Hello dear: " + this.name);
    }
}
