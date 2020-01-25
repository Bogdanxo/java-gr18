package modificatoracces.package1;

public class Main {
    public static void main(String[] args) {
        //obiect clock
        Clock clock = new Clock(10, 1);
        clock.time = 800;
        clock.setTime(1000);

        Clock newClock = new Clock(100, 1);
        System.out.println(readClock(newClock));

        //obiec creat apeland emtodat statica
        Clock clock1 = Clock.newinstance();
        setClock(clock1, 1000);
        System.out.println(readClock(clock1));

        //obiec creat apeland emtodat statica
        //oclock1 si clock2 sunt de fapt aceelasi obiect pe heap
        Clock clock2 = clock.newinstance();
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

