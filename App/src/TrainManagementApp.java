import java.util.Arrays;
import java.util.Scanner;

public class TrainAppUC19 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Unsorted bogie IDs
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 1: Sort the array (precondition)
        Arrays.sort(bogieIds);

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // User input
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        // Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1;  // search right
            }
        }

        // Result
        if (found) {
            System.out.println("\nBogie ID FOUND using Binary Search ");
        } else {
            System.out.println("\nBogie ID NOT FOUND ");
        }

        System.out.println("\nProgram continues...");
    }
}