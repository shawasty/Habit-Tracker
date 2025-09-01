import java.util.Scanner;

public class Main {
    //define a scanner object
    private static final Scanner in = new Scanner(System.in);

    // single tracker used by program
    private static final HabitTracker tracker = new HabitTracker();
        
    public static void main(String[] args) {
        while (true) {                         // infinite loop — we break out when user chooses 0
            System.out.println("\nHabit Tracker"); // print menu header
            System.out.println("1) Add habit");
            System.out.println("2) Mark done");
            System.out.println("3) List habits");
            System.out.println("0) Exit");
            System.out.print("Choose: ");     // print prompt without newline

            String choice = in.nextLine().trim(); // read a line from the user and remove whitespace
            switch (choice) {
                case "1": addHabit(); break;  // if user typed 1 → call addHabit()
                case "2": markDone(); break;  // if 2 → call markDone()
                case "3": tracker.listHabits(); break; // 3 → print list
                case "0": System.out.println("Bye!"); return; // 0 → exit program
                default: System.out.println("Invalid choice"); // anything else
            }
        }
    }

    private static void addHabit() {
        System.out.print("Habit name: ");
        String name = in.nextLine();            // read user text for habit name
        try {
            if (tracker.findByName(name) != null) {
                System.out.println("That habit already exists."); // prevent duplicates
                return;
            }
            tracker.addHabit(new Habit(name));  // create Habit object and add to tracker
            System.out.println("Added!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // show validation message from constructor
        }
    }

    private static void markDone() {
        System.out.print("Which habit? ");
        String name = in.nextLine();  
        Habit h = tracker.findByName(name);
        if (h == null) {
            System.out.println("Not found.");
        } else {
            h.markDone();                      
            System.out.println("Nice! " + h);  
        }
    }
}
