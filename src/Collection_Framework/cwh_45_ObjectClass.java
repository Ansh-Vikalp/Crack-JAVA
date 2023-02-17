package Collection_Framework;

class Food {
    private String foodName;

    private String foodType;

    private int quantityAvailable;

    private int unitPrice;

    private String cuisine;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    @Override
    /**
     * @param o: Object type;
     */
    public boolean equals(Object o) {
        Food temp = (Food) o;

        if (this.foodName.equals(temp.foodName)) {
            if (this.foodType.equals(temp.foodType)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = 1;

        return result + this.foodType.hashCode();

    }

    // Comment this meathod to see the hexadecimal code of Object: Food
    @Override
    public String toString() {
        return "-----------------Food Details--------------------" +
                "\nFoodName: " + this.foodType +
                "\nFoodType: " + this.foodType +
                "\nCuisine: " + this.cuisine +
                "\nQuantityAvailable: " + this.quantityAvailable +
                "UnitPrice: " + this.unitPrice;
    }

}

public class cwh_45_ObjectClass {
    public static void main(String[] args) {
        // ? Object1
        Food foodOne = new Food();
        foodOne.setFoodName("Maggi");
        foodOne.setFoodType("Veg");
        foodOne.setQuantityAvailable(100);
        foodOne.setUnitPrice(12);
        foodOne.setCuisine("Mummy Ki Kitchen");

        // ? Object2
        Food foodTwo = new Food();
        foodTwo.setFoodName("Maggi");
        foodTwo.setFoodType("Veg");
        foodTwo.setQuantityAvailable(100);
        foodTwo.setUnitPrice(12);
        foodTwo.setCuisine("Mummy Ki Kitchen");

        if (foodOne == foodTwo)
            System.out.println("foods object are equal");
        else
            // ! == operator always compare memory location but not its value
            System.out.println("food objects aren't equal");

        // * Whenever we want to compare two objects based on their data member value we
        // *need to Override the equals() of Object class.
        // *By default equals() compre two object memory (just similar to ==)
        System.out.println("Overriden equals(): " + foodOne.equals(foodTwo));

        // *We can also Override hashCode() which uses object attribute mathematical
        // *calcultion to
        // *display a 32 bit integer object hash code
        // *By default it derives hash value based on memory address of Objects
        // *If two object are equal by the equals() then their hashCode() will also be
        // *same.
        System.out.println("\nHashcode for foodOne: " + foodOne.hashCode());
        System.out.println("Hashcode for foodTwo: " + foodTwo.hashCode());

        // *There is toString() meathod which is used to return texual representation of
        // *an object.
        // *By default it returns an unsigned hexadecimal memory of object heap
        // *System.out.println(obj); also adorns to same
        // *System.out.println(obj.tostring());
        // *But; we can Overide it to display more usefull messages related to exception
        // *or class properties.
        // System.out.println();
        // System.out.println();

        // ? When not overriden-
        // System.out.println("hashCode of Obj attribute: " + foodOne.hashCode());
        // System.out.println("unsigned hexadecimal representaton: " + foodOne);
        // System.out.println("unsigned hexadecimal representaton: " +
        // foodOne.toString());

        System.out.println();
        System.out.println();

        // ? When Overriden toString():-

        System.out.println(foodOne.toString());
        System.out.println();
        System.out.println();
        System.out.println(foodTwo.toString());

    }
}
