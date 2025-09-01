class Habit {
    // declare variables
    private final String name;
    private int streak;

    // constructor
    public Habit(String habitName) {
        if (habitName == null || habitName.isBlank()) {
            throw new IllegalArgumentException("Name can't be empty");
        } else {
            this.name = habitName;
        }

        this.streak = 0;
    }
    // construct gettersfor the variables
    public String getName(){
        return name;
    }
    public int getStreak(){
        return streak;
    }

    //method to mark habit as done if it occurs 
    public void markDone() {
        streak++;
        
    }

    @Override
    public String toString() {
        return name + "- streak: " + streak;
        
    }


}

