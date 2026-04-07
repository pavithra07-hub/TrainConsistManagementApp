import java.util.Scanner;

public class TrainAppUC18 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // User input
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break; // early termination
            }
        }

        // Result
        if (found) {
            System.out.println("\nBogie ID FOUND in the train ✅");
        } else {
            System.out.println("\nBogie ID NOT FOUND ❌");
        }

        System.out.println("\nProgram continues...");
    }
}