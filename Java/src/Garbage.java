public class Garbage {
    public static void main(String[] args) {
        Garbage garbage = new Garbage("Ashdod", 50.0, 30.0);
        Garbage garbage1 = new Garbage("Ashqelon", 70.0, 50.0);
        Garbage garbage2 = new Garbage("Tel-Aviv", 80.0, 40.0);
        Garbage[] garbage3 = {garbage,garbage1,garbage2};
        System.out.println(arr(garbage3));

    }

    private String location;//מיקום הפח מטיפוס מחרוזת
    private double capacity;//קיבולת מקסימלית בק"ג לפח מטיפוס ממשי
    private double quantity;// כמות ק"ג נוכחית בפח מטיפוס ממשי

    public Garbage(String location, double capacity, double quantity) {
        this.location = location;
        this.capacity = capacity;
        this.quantity = quantity;
    }

    public static String[] arr(Garbage[] garbage) {
        int count = 0;
        for (int i = 0; i < garbage.length; i++) {
            if (garbage[i].quantity > garbage[i].capacity) {
                count++;
            }
        }
        String[] locationsToEmpty = new String[count];
        int index = 0;
        for (int i = 0; i < garbage.length; i++) {
            if (garbage[i].quantity > garbage[i].capacity / 2) {
                locationsToEmpty[index] = garbage[i].location;
                index++;
            }
        }
        return locationsToEmpty;
    }
}


