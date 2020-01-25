package primitiveandnonprimitiveexamples;

public class Examples {

    public static void main(String[] args) {

        int aPrimitiveValue = 5;
        changePrimitiveValue(aPrimitiveValue);
        System.out.println(aPrimitiveValue);

        Test test = new Test();
        test.setInstanceVariable(888);
        System.out.println(test.getInstanceVariable());

        changeObiectValue(test);

        System.out.println(test.getInstanceVariable());
    }

    //pt variabilele primitive se paseaza VALOAREA
    public static void changePrimitiveValue(int value) {
        System.out.println("inside method the value is: " + value);
        value = 100;

        System.out.println("inside method the value is " + value);
    }

    public static void changeObiectValue(Test obiect) {
        obiect.setInstanceVariable(1000);
    }
}
