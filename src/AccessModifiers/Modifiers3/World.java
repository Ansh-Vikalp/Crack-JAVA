package AccessModifiers.Modifiers3;

import AccessModifiers.Modifiers.*;

public class World {
    public static void main(String[] args) {
        cwh_25_AccessModifiers kk = new cwh_25_AccessModifiers();
        System.out.println("cwh_25_AccessModifiers public: " + kk.cwh_25_x);// ✅ Only public members are allowed to
                                                                            // access everywhere

        // ❌ All the others modifiers visibility not allowed

        // System.out.println("cwh_25_AccessModifiers protected: " + kk.cwh_25_y);
        // System.out.println("cwh_25_AccessModifiers default: " + kk.cwh_25_z);
        // System.out.println("cwh_25_AccessModifiers private: " + kk.cwh_25_a);

    }
}
