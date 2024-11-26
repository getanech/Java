import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
//        Clock clock = new Clock(21, 45);
//        System.out.println(clock.getInterval()); // הדפסת 195

        Scanner scanner = new Scanner(System.in);

        // קלט עבור הטיסה הראשונה
        System.out.println("Enter the landing time for flight 1 (hour and minute): ");
        int hour1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        Clock flight1 = new Clock(hour1, min1);

        // קלט עבור הטיסה השנייה
        System.out.println("Enter the landing time for flight 2 (hour and minute): ");
        int hour2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        Clock flight2 = new Clock(hour2, min2);

        // בדיקה איזו טיסה נוחתת מאוחר יותר
        if (flight1.getInterval() < flight2.getInterval()) {
            System.out.println("Flight 1 lands later.");
        } else if (flight1.getInterval() > flight2.getInterval()) {
            System.out.println("Flight 2 lands later.");
        } else {
            System.out.println("Both flights land at the same time.");
        }

        scanner.close();
    }
    private int hour; //0-23 שעה
    private int min; //0-59 דקות
    public Clock(int hour, int min) {
        this.hour = hour;
        this.min = min;
    }
    public int getInterval() {
        int totalMinutesInDay = 24 * 60; // 1440 דקות
        int passedMinutes = (this.hour * 60) + this.min; // מספר הדקות שעברו מתחילת היום
        return totalMinutesInDay - passedMinutes; // מספר הדקות שנותרו עד חצות
    }


}



