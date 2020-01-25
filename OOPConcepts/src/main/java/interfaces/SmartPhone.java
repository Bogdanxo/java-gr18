package interfaces;

public class SmartPhone implements GPS, Radio {
    int O_VALOARE = 10; //in interfaces atributele sunt constante
    public long getGPSCoordinates() { //metodele sunt publice tot timpul
        System.out.println("afisare coordonate de pe smartphone");
        return 0;
    }

    @Override //suntem obligati de program sa implementam override pentru pentodele care nu au body
    public void playChannel() {
        System.out.println("CHannel is played");
    }

    @Override //suntem obligati de program sa implementam override pentru pentodele care nu au body
    public void stopChannel() {
        System.out.println("CHannel was stopped");
    }

    @Override //doar daca dorim sa extindem functionalitatea metodei default din interfata (ea are body)
    public void next() {
        System.out.println("Do something else and then call the logic from base");
        Radio.super.next();
    }
}
