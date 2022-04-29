package inheritanceandpolymorphism;

interface Mobile {
    String unlock();
    String call(String mobileNumber);
    String openApp(String appName);
}

public class Samsung{
    String brand;

    public Samsung() {
        this.brand = "Samsung";
    }

    public String unlock() {
        String unlockMessage = this.brand + ": " + "Unlocked";
        return unlockMessage;
    }

    public String call(String mobileNumber) {
        String callingMessage = this.brand + ": " + "calling " + mobileNumber;
        return callingMessage;
    }

    public String openApp(String appName) {
        String openAppMessage = this.brand + ": " + "opening " + appName;
        return openAppMessage;
    }

}
