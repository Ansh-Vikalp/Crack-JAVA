package Collection_Framework;

class XYZ {
    Object obj;

    XYZ(Object obj) {
        this.obj = obj;
    }

    public void setData(Object object) {
        this.obj = object;
    }

    public Object getData() {
        return this.obj;
    }
}

public class cwh_46_NonGenerics {
    public static void main(String[] args) {

        // Non generic
        /*
         * This non-generic Container class operates on objects of any type.
         * 
         * Since its methods accept or return an Object, you can pass whatever you want
         * but there is no way to verify at compile time, how the class is being used.
         * Someone may place an Integer in the container and expect to get Integers out
         * of it, while someone else may pass in a String resulting in a runtime error.
         */

        XYZ a = new XYZ("Ramu");
        System.out.println(a.getData());

    }
}
