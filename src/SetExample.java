import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        // Create a Set
        Set<Integer> numbers = new HashSet<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // duplicate (will be ignored)

        // Display Set
        System.out.println("Set elements: " + numbers);

        // Check element
        System.out.println("Contains 10? " + numbers.contains(10));

        // Remove element
        numbers.remove(30);

        // Loop through Set
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
