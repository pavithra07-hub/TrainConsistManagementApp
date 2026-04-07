import java.util.Arrays;

public class TrainAppUC17 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Bogie type names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Built-in sorting
        Arrays.sort(bogieNames);

        System.out.println("\nAfter Sorting (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nProgram continues...");
    }
}