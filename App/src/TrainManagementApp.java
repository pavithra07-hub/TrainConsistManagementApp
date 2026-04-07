import java.util.Arrays;

public class TrainManagementApp {

    // Method to perform search with validation
    public static boolean searchBogie(String[] bogies, String key) {

        // Step 1: Fail-fast validation
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("No bogies available in the train to perform search.");
        }

        // Step 2: Perform Linear Search (can also use binary if sorted)
        for (String bogie : bogies) {
            if (bogie.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Test Case 1: Empty array (should throw exception)
        String[] emptyTrain = {};

        try {
            System.out.println("Searching in empty train...");
            searchBogie(emptyTrain, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test Case 2: Valid search
        String[] bogies = {"BG101", "BG205", "BG309"};

        try {
            System.out.println("\nSearching in valid train...");
            boolean found = searchBogie(bogies, "BG205");

            if (found) {
                System.out.println("Bogie found in the train.");
            } else {
                System.out.println("Bogie not found in the train.");
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test Case 3: Not found case
        try {
            boolean found = searchBogie(bogies, "BG999");

            if (!found) {
                System.out.println("Bogie not found in the train.");
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}