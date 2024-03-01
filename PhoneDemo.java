class Phone {
    public void dial() {
        System.out.println("Dialing a call...");
    }
}
class CameraPhone extends Phone {
    public void dial(String contact) {
        System.out.println("Dialing " + contact + " and capturing a photo...");
    }
}
class SmartPhone extends Phone {
    public void dial(String contact) {
        System.out.println("Dialing " + contact + " with smart features...");
    }
}
public class PhoneDemo {
    public static void main(String[] args) {
        Phone basicPhone = new Phone();
        CameraPhone cameraPhone = new CameraPhone();
        SmartPhone smartPhone = new SmartPhone();
        System.out.println("Basic Phone:");
        basicPhone.dial();
        System.out.println("\nCamera Phone:");
        cameraPhone.dial("John");
        System.out.println("\nSmart Phone:");
        smartPhone.dial("Alice");
    }
}
