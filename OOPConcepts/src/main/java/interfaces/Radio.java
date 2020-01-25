package interfaces;

public interface Radio {
    void playChannel(); //metodata absracta = nu are body
    void stopChannel(); //metodata absracta = nu are body
    default public void next() { //in java 8 metodele pot avea body
        System.out.println("Play next channel");
    }
}
