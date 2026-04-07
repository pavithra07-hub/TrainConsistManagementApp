import java.util.ArrayList;
import java.util.List;

// Bogie class (reuse)
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainAppUC10 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        // Calculate total seating capacity using stream
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);   // sum all values

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nProgram continues...");
    }
}