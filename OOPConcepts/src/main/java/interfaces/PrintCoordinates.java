package interfaces;

public class PrintCoordinates {
    public static void main(String[] args) {
        displayGPSForSupportedDevices(new SmartPhone());
        displayGPSForSupportedDevices(new SmartWatch());

        GPS[] devicesWithGPS = new GPS [3]; //creez array cu deviceurile care au gps si apoi pe pozitiile 0 1 2 3 le pun in array
        devicesWithGPS[0] = new SmartWatch();
        devicesWithGPS[1] = new SmartPhone();
        devicesWithGPS[2] = new SmartWatch();

        for (GPS devices : devicesWithGPS) {
            devices.getGPSCoordinates();
        }

        SmartPhone smartPhone = new SmartPhone();
        playChannelOnRadio(smartPhone);
        moveToTheNextChannel(smartPhone);
    }

    public static void displayGPSForSupportedDevices(GPS device) {
        System.out.println("Cautare locatie...");
        device.getGPSCoordinates();
    }

    public static void playChannelOnRadio(Radio radio) {
        radio.playChannel();
    }

    public static void moveToTheNextChannel(Radio radio) {
        radio.next();
    }
}

