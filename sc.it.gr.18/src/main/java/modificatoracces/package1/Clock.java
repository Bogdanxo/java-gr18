package modificatoracces.package1;

public class Clock {
    protected long time = 0;
    private long offset;
    private static Clock instance;

    private Clock(long time) {
        this.time = time;
    }
    //variante de a crea obiecte cu o clasa care are constructor privat

    //varianta 1 - de apelare a unui constructor privat
    public Clock(long time, long offset) {
        this(time);
        this.offset = offset;
    }
    //varianta 2 de apelare a unui constructor privat
    //singleton design pattern
    public static Clock newinstance() {
        if (instance == null) {
            instance = new Clock(System.currentTimeMillis());
        }
        return instance;
    }
    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
