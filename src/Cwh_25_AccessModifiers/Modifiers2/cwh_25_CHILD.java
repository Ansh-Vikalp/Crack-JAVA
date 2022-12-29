//  CASE OF VISIBILITY IN DIFFRENT PACKAGE 

package Cwh_25_AccessModifiers.Modifiers2;

import Cwh_25_AccessModifiers.Modifiers.*;

public class cwh_25_CHILD extends cwh_25_AccessModifiers {
    public static void main(String[] args) {
        cwh_25_CHILD ch = new cwh_25_CHILD();

        System.out.println("cwh_25_AccessModifiers public: " + ch.cwh_25_x);// accessible everywhere
        System.out.println("cwh_25_AccessModifiers protected: " + ch.cwh_25_y);// accessible in same package OR sub
                                                                               // class in diffrent package

        // ❌ Default members can only access within same package while private in same
        // class only
        // System.out.println("cwh_25_AccessModifiers default: " + ch.cwh_25_z);
        // System.out.println("cwh_25_AccessModifiers private: " + ch.cwh_25_a);
    }

}
