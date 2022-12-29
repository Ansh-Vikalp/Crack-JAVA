
//For this file and all other files ouside any folder the default packge is "src"
//Demo of Using Packages in JAVA
import Ramayan.Lanka.Ravan;//user defined package( only class get imported )
import Ramayan.VanarSena.*;// user defined package(all classes get imported except it's sub-package)

public class cwh_24_PackageRam {

    public static void main(String[] args) {
        System.out.println("Ram Class");
        Hanuman h = new Hanuman();
        h.han();

        Ravan r = new Ravan();
        r.bad();

        Mahabharat.Krishna k = new Mahabharat.Krishna(); // by quantified name or specifing location
        k.prayer();

    }

}
