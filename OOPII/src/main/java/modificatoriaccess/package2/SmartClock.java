package modificatoriaccess.package2;

import modificatoriaccess.package1.Clock;

public class SmartClock extends Clock {


    public SmartClock(long time, long offset) {
        super(time, offset);
    }

    public long convertToMiliseconds() {
        return time/1000;
    }
}
