package interfaces;

public class PrintCoordonates {

    public static void main(String[] args) {
        displayGPSForSupportedDevices(new SmartPhone());
        displayGPSForSupportedDevices(new SmartWatch());


        GPS[] devicesWithGPS = new GPS[3];
        devicesWithGPS[0] = new SmartWatch();
        devicesWithGPS[1] = new SmartPhone();
        devicesWithGPS[2] = new SmartWatch();

        for (GPS device : devicesWithGPS) {
            device.getGPSCoordonates();
        }

        SmartPhone smartPhone = new SmartPhone();
        playChannelOnRadio(smartPhone);
        moveToTheNextChannel(smartPhone);
    }

    public static void displayGPSForSupportedDevices(GPS device) {
        System.out.println("Cautare locatie...");
        device.getGPSCoordonates();
    }

    public static void playChannelOnRadio(Radio radio) {
        radio.playChannel();
    }

    public static void moveToTheNextChannel(Radio radio) {
        radio.next();
    }
}
