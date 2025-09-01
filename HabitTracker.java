import java.util.ArrayList;
import java.util.List;

public class HabitTracker {
    private final List<Habit> habits;

    // constructor
    public HabitTracker() {
        this.habits = new ArrayList<>();
    }

    // add a habit to the List
    public void addHabit(Habit h) {
        habits.add(h);

    }
    // find a habit by its name (case-insensitive)
    public Habit findByName(String name) {
        for (Habit h : habits) {
            if (h.getName().equalsIgnoreCase(name)) {
                return h;
                
            }
            
        }
        // return null of not found
        return null;       
    }

    //list all habits to the console
    public void listHabits(){
        if(habits.isEmpty()){
            System.out.println("No habits found");
            // exit the method
            return;
        }
        // declare a number for display
        int i = 1;

        for (Habit h : habits) {
            System.out.println(i++ + ". "+ h);
            
        }
    }
   


}
