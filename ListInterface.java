import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        // Create a list
        List<String> myList = new ArrayList<>();
        
        // Add elements to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        
        // Display the elements using the List interface
        System.out.println("Elements in the list:");
        for (String item : myList) {
            System.out.println(item);
        }
        
        // Add more elements to the list
        myList.add("Grapes");
        myList.add("Pineapple");
        
        // Remove an element from the list
        myList.remove("Banana");
        
        // Display the updated elements in the list
        System.out.println("Updated elements in the list:");
        for (String item : myList) {
            System.out.println(item);
        }
        
        // Access elements by index
        System.out.println("Accessing elements by index:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at index " + i + ": " + myList.get(i));
        }
    }
}

