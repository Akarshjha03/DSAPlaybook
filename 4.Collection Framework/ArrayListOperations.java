import java.util.*;

public class ArrayListOperations{
    public static void main(String args[]) {
        // Create an ArrayList to store Integer values
        ArrayList<Integer> age = new ArrayList<>();

        // Add elements to the list
        age.add(22);
        age.add(14);
        age.add(64);
        age.add(48);

        // Add element 77 at index 2
        age.add(2, 77);

        // Print the list after insertions
        System.out.println("ArrayList after adding elements: " + age);

        // Get the element at index 3
        System.out.println("Element at index 3: " + age.get(3));

        // Set index 1 value to 10
        age.set(1, 10);
        System.out.println("ArrayList after setting index 1 to 10: " + age);

        // Remove element at index 4
        System.out.println("Removed element at index 4: " + age.remove(4));

        // Print the size of the ArrayList
        System.out.println("Size of ArrayList: " + age.size());

        // Check if ArrayList contains value 10
        System.out.println("Does ArrayList contain 10? " + age.contains(10));

        // Check if ArrayList is empty
        System.out.println("Is ArrayList empty? " + age.isEmpty());

        // Clear the ArrayList
        // age.clear();
        // System.out.println("ArrayList after clearing: " + age);

        // Sort the ArrayList
        Collections.sort(age);
        System.out.println("Sorted ArrayList: " + age);
    }
}
