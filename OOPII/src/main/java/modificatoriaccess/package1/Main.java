package modificatoriaccess.package1;

public class Main {
    public static void main(String[] args) {
        //obiect clock
        Clock clock = new Clock(10, 1);
        clock.time = 800;
        setClock(clock, 100);

        Clock newClock = new Clock(100, 1);
        System.out.println(readClock(newClock));

        //obiect creat apeland metoda statica
        Clock clock1 = Clock.newInstance();
        setClock(clock1, 1000);
        System.out.println(readClock(clock1));

        //obiect creat apeland metoda statica
        //clock1 si clock2 sunt de fapt acelasi obiect pe heap
        Clock clock2 = clock.newInstance();
        setClock(clock2, 5000);

        System.out.println(readClock(clock1));
        System.out.println(readClock(clock2));
    }

    public static void setClock(Clock clock, long time) {
        clock.setTime(time);
    }

    public static long readClock(Clock clock) {
        return clock.getTime();
    }
}
