package exercitiu1;

public class Caine extends Animal {
    public void bark () {
        System.out.println("Cainele latra");
    }

    //OVERLOAD (adica utilizam acelasi nume de metoda doar ca introducem alti parametrii
    public void bark (int intensitate) {
        System.out.println("Cainele latra cu intensitatea" + intensitate);
    }
}
