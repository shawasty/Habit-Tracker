public class Main {
    public static void main(String[] args) {
        Habit h = new Habit(" Study 30 mins "); // create a Habit (calls constructor)
        System.out.println(h);                  // prints "Study 30 mins — streak: 0"
        h.markDone();                           // increase streak to 1
        System.out.println(h);                  // prints "Study 30 mins — streak: 1"
    }
}
