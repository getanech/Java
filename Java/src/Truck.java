public class Truck {
    public static void main(String[] args) {
        Truck truck = new Truck("245613", "danny", 5, true);
        Truck truck1 = new Truck("245614", "matan", 6, false);
        Truck truck2 = new Truck("245615", "Haim", 20, true);
        Truck truck3 = new Truck("245616", "nisim", 2, false);
        Truck truck4 = new Truck("245617", "oz", 4, true);
        Truck[] T = {truck, truck1, truck2, truck3, truck4};
        PrintName(T);
        System.out.println(TtuckisFree(T));

    }
    private String truckId;// מספר רישוי -
    private String driverName;// שם נהג
    private int numStorge;// מספר מקומות אחסון עבור המטען
    private boolean isFree;// האם המשאית פנויה להובלה?

    public Truck(String truckId, String driverName, int numStorge, boolean isFree) {
        this.truckId = truckId;
        this.driverName = driverName;
        this.numStorge = numStorge;
        this.isFree = isFree;
    }

    public static void PrintName(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i].isFree && trucks[i].numStorge < 7) {
                System.out.println(trucks[i].driverName);
            }
        }
    }
    public static String TtuckisFree(Truck[] trucks2) {
        String bestTruckId = "Unable to service";
        int sum = 0;
        for (int i = 0; i < trucks2.length; i++) {
            if (trucks2[i].isFree && trucks2[i].numStorge > sum){
                sum+=trucks2[i].numStorge;
                bestTruckId=trucks2[i].truckId;
            }
        }return bestTruckId;
    }
}


