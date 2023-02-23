package Documentation;

//Creating a more heavy Documentation

/**
 * A <b>Rectangle</b> class representing a 2-D Figure having length and Breadth.
 * <img src="src\rre.jpg" alt="loading failed..." height="100" width="100"
 * style=
 * "vertical-align:middle">
 * 
 * @author Ansh-Vikalp
 * @since 2023
 * @version 1.0
 * 
 */

class Rectangle {

    private int length;
    private int breadth;

    /**
     * A default constructor of Rectangle
     * 
     * @deprecated Please use the Parameterised constructor of this class
     * 
     */
    Rectangle() {
    }

    /**
     * A paramerized constructor of Rectangle--RECOMMENDED
     * 
     * @param length  Length of Rectangle
     * @param breadth Breadth of Rectangle
     * 
     */
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    /**
     * This meathod is to set the <I>Length</I> of rectangle instance
     * 
     * @param l set length for rectangle
     */
    public void setLength(int l) {
        this.length = l;
    }

    /**
     * This meathod is to get the <I>Length</I> of rectangle instance
     * 
     * @return length of rectangle instance
     */
    public int getLength() {
        return this.length;
    }

    /**
     * This meathod is to set the <I>Breadth</I> of rectangle instance
     * 
     * @param b set Breadth for rectangle
     */
    public void setBreadth(int b) {
        this.breadth = b;

    }

    /**
     * This meathod is to get the <I>Breadth</I> of rectangle instance
     * 
     * @return Breadth of rectangle instance
     */
    public int getBreadth() {
        return this.breadth;
    }

    /**
     * Display area of our rectangle
     * {@code int area= length*breadth}
     * 
     */
    public void area() {
        System.out.println("Area of Rectangle= " + (this.length * this.breadth));
    }

    /**
     * Display perimeter of our rectangle
     * {@code int perimeter= 2*(length+breadth)}
     */
    public void perimeter() {
        System.out.println("Perimeter of Rectangle= " + 2 * (length + breadth));
    }

}

/**
 * A <b>Cuboid</b> class representing a 3-D Figure having length, Breadth and
 * Height.
 * <img src="src\Cubo99.jpg" alt="loading failed..." height="100" width="100"
 * style=
 * "vertical-align:middle">
 * 
 * @author Ansh-Vikalp
 * @since 2023
 * @version 1.0
 * @see also {@link Rectangle#area()}
 */

class Cuboid extends Rectangle {
    private int height;

    /**
     * A default constructor of Cuboid
     * 
     * @deprecated Please use the Parameterised constructor of this class
     * 
     */

    public Cuboid() {
    }

    /**
     * A parameterized constructor of Cubiod--RECOMMENDED
     * 
     * @param length  Length of Cuboid
     * @param breadth Breadth of Cuboid
     * @param height  Height of Cuboid
     */
    public Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    /**
     * This meathod is to set the <I>Height</I> of cuboid instance
     * 
     * @param height set Height for cuboid
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * This meathod is to get the <I>Height</I> of cuboid instance
     * 
     * @return Height of cuboid instance
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Display base area of our cuboid
     * <p>
     * Overriden from Parent- Rectangle class
     * 
     */
    @Override
    public void area() {
        System.out.println("Base Area= " + (getLength() * getBreadth()));
    }

    /**
     * Displays the Lateral Surface Area of Cuboid
     * <p>
     * (Area of 4- sided walls)
     */
    public void lateralArea() {
        System.out.println("Lateral Area= " + 2 * (getLength() * getHeight() + getBreadth() * getHeight()));
    }

    /**
     * Displays total Surface Area of Cuboid
     */
    public void totalArea() {
        System.out.println("Total Area= "
                + 2 * (getLength() * getBreadth() + getLength() * getHeight() + getBreadth() * getHeight()));
    }

    /**
     * Displays volume of Cuboid
     */
    public void volume() {
        System.out.println("Volume= " + getLength() * getBreadth() * this.height);
    }

}

/**
 * This is just a Tester class for Rectangle and Cuboid Objects
 * 
 * @author Ansh-Vikalp
 * @since 2013
 * @see also Cuboid
 */
public class cwh_66_Demo2 {
    /**
     * A main meathod of public class cwh_66_Demo2
     * 
     * @param args Array of string taken from Command Line
     */
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setBreadth(4);
        r1.perimeter();
        r1.area();

        System.out.println();
        System.out.println();

        Cuboid c1 = new Cuboid(2, 4, 5);
        System.out.println("Length= " + c1.getLength());
        System.out.println("Breadth= " + c1.getBreadth());
        System.out.println("Height= " + c1.getHeight());
        c1.lateralArea();
        c1.totalArea();
        c1.volume();

    }
}
