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


}
