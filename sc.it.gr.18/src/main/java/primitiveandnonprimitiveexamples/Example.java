package primitiveandnonprimitiveexamples;

public class Example {
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

    //pt variabilele primiteve se paseaza valorea
    public static void changePrimitiveValue(int value){
        value = 100;
    }
    public static void changeObiectValue(Test obiect) {
        obiect.setInstanceVariable(1000);
    }
}
