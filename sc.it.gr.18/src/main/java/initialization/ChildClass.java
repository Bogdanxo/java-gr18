package initialization;

public class ChildClass extends BaseClass {

    static {
        System.out.println("child static block");
    }

    {
        System.out.println("child regular block");
    }
    public ChildClass() {
        System.out.println("child constructor");
    }
}
