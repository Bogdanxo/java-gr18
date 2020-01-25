package initialization;

public class BaseClass {
    private int variabila = 100;

    static {
        System.out.println("baseClass static initialization block");
    }

    {
        System.out.println("baseClass regular initialization block");
        variabila = 100;
    }

    public BaseClass() {
        System.out.println("constructor in BaseClass inti");
        this.variabila = 100;
    }
}
