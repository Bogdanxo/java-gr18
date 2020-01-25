package initialization;

public class ChildClass extends BaseClass {
    private String newVar;

    public ChildClass(int variabila) {
        super(variabila);
        this.newVar = "another value";
    }

    public ChildClass(int variabila, String newVar) {
        super(variabila);
        this.newVar = newVar;
    }
//    static {
//        System.out.println("child static block");
//    }
//
//    {
//
//        System.out.println("child regular block");
//    }

//   x

    @Override
    public String displaySomeInitData() {
        this.newVar = "another another value";
       String valueFromBaseClass =  super.displaySomeInitData();
        System.out.println("child displaySomeInitData");

        return valueFromBaseClass + "new Value";
    }
}
