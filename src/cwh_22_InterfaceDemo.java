import java.util.Arrays;

class CellPhonepp {

    String[] persons;

    CellPhonepp(String[] per) {
        persons = new String[per.length];
        for (int i = 0; i < per.length; i++) {
            persons[i] = per[i];
        }

    }

    public void call(String name) {
        int p = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == name) {
                p = 1;
                break;
            }
        }
        if (p == 1)
            System.out.println("Calling..." + name);
        else
            System.out.println("Person not present in Contact");
    }

    public void rejectCall() {
        System.out.println("Call Rejected...");
    }

    public void displayContacts() {
        System.out.println(Arrays.toString(persons));

    }
}

interface wifi {
    public final static String[] network = new String[] { "anshV2029", "Redmi9A",
            "Rudransh Hospital",
            "SHIVAM HOME APPLIANCE" };

    public abstract void searchWifi();
}

interface Camera {

    void takeSnap();

    void recordVideo();
}

interface GPS {
    default void loaction() {
        System.out.println("Current Location is: Patel nagar, Bhopal");
    }
}

class SmartPhonekl extends CellPhonepp implements GPS, wifi, Camera {

    SmartPhonekl(String... drr) {
        super(drr);
    }

    public void takeSnap() {
        System.out.println("Say CHEESE!");
    }

    public void recordVideo() {
        System.out.println("Manoj bhai aap to chutia bana rahe ho!");
    }

    @Override
    public void searchWifi() {
        System.out.println("Nearby: " + Arrays.toString(SmartPhonekl.network));

    }

}

public class cwh_22_InterfaceDemo {

    public static void main(String[] args) {

        // This program brings the complex use case of inheritance, interface,
        // constructor calling sequence, default meathod in interface, public static
        // final feilds.
        // Nahi samajh aaye to 🤸‍♂️👆

        SmartPhonekl RedmiNote8 = new SmartPhonekl("Papa", "Home", "Abhishree", "PlayBoy");
        RedmiNote8.displayContacts();
        RedmiNote8.call("Papa");
        RedmiNote8.rejectCall();
        RedmiNote8.call("Manoj Bajpaye");
        RedmiNote8.takeSnap();
        RedmiNote8.recordVideo();
        RedmiNote8.loaction();
        RedmiNote8.searchWifi();

    }
}
