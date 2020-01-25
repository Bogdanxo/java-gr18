package interfaces;

public interface Radio {
    void playChannel(); //metoda abstracta

    void stopChannel();

    default void next() {
        System.out.println("Playing next channel");
    }
}
