import java.util.HashSet;
import java.util.Scanner;

class Box {

    private double length;
    private double width;
    private double height;
    private double volume;
    private static HashSet<Box> box_series;
    private static HashSet<Double> box_volume;
    private String name;
    private static int count;

    static {
        box_series = new HashSet<>();
        box_volume = new HashSet<>();
        count = 0;
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = (length * width * height);
        this.name = "Box " + (++count);

    }

    public void addBox() {

        if (box_volume.size() == 0) {
            box_volume.add(this.volume);
            box_series.add(this);
        }

        else {
            if (!box_volume.contains(this.volume)) {
                box_volume.add(this.volume);
                box_series.add(this);
            }
        }
    }

    public static void display() {

        System.out.println("-----------------------DISTINCT BoXeS-----------------------------\n");

        for (Box box : box_series) {
            System.out.println("\t\t\t|| " + box.name + " ||");
            System.out.println("Volume: " + box.volume);
            System.out.println("Length: " + box.length);
            System.out.println("Width: " + box.width);
            System.out.println("Height: " + box.height);
            System.out.println();
        }
    }

}

public class SetOfBoxes {

    public static void creator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press N to stop creating box\n\n");
        int l = 0;
        while (true) {
            System.out.println("\t\t\t|| Box " + (l + 1) + " ||");
            System.out.print("Length: ");
            double lt = sc.nextDouble();
            System.out.print("Width: ");
            double wt = sc.nextDouble();
            System.out.print("Height: ");
            double ht = sc.nextDouble();

            new Box(lt, wt, ht).addBox();// Aggreation
            sc.nextLine();
            System.out.print("Create more box? ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("No") || choice.equalsIgnoreCase("N")) {
                System.out.println("\n\n\n");
                break;
            }
            System.out.println();
            System.out.println();

            l++;
        }

        sc.close();
    }

    public static void main(String[] args) {

        SetOfBoxes.creator();

        Box.display();

    }

}
