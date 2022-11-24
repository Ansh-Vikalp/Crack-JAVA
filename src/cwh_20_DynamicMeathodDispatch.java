class Phone {
    public void makeCall() {
        System.out.println("Ringing...");
    }

    public void switchOn() {
        System.out.println("Button phone turned on...");
    }
}

class SmartPhone extends Phone {
    @Override
    public void switchOn() {
        System.out.println("Smartphone turned on...");
    }

    public void playMusic() {
        System.out.println("Playing Amplifier...");
    }
}

public class cwh_20_DynamicMeathodDispatch {
    public static void main(String[] args) {

        Phone Nokia3310 = new Phone();
        Nokia3310.switchOn();
        Nokia3310.makeCall();

        System.out.println();
        System.out.println();

        SmartPhone vivo2029 = new SmartPhone();
        vivo2029.switchOn();
        vivo2029.makeCall();
        vivo2029.playMusic();

        System.out.println();
        System.out.println();

        // Parent can refers to child object
        Phone p2 = new SmartPhone();// ✅ Allowed as a smartphone can generalised called as phone
        p2.switchOn();
        p2.makeCall();
        // specialized meathods are not accessible by the above reference.
        // p2.playMusic();❌ Not allowed we can't play music in phone(button)

        // SmartPhone s2= new Phone();// ❌ Not allowed we can't say phone as smartphone

    }
}
