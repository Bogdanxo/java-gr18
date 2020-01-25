package initialization;

public class Main {
    public static void main(String[] args) {
      //  BaseClass baseClass = new BaseClass();

        ChildClass childClass = new ChildClass(100);
        childClass.displaySomeInitData();
    }
}
