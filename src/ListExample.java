import java.util.ArrayList;   // Import ArrayList class

public class ListExample {
    public static void main(String[] args) {

        // Create an ArrayList that holds String values
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Print the ArrayList
        System.out.println(fruits);  // Output: [Apple, Banana, Mango]

        // Get element from ArrayList
        System.out.println(fruits.get(1)); // Output: Banana

        // Change element
        fruits.set(1, "Orange");
        System.out.println(fruits); // Output: [Apple, Orange, Mango]

        // Remove element
        fruits.remove("Apple");
        System.out.println(fruits); // Output: [Orange, Mango]

        // Get size of the ArrayList
        System.out.println(fruits.size()); // Output: 2
    }
}
