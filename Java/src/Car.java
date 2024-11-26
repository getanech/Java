public class Car {
    public static void main(String[] args) {
        Car cars = new Car("259560","0522448545",'E',700.00);
        Car cars1 = new Car("259281","0533393026",'W',500.00);
        Car cars2 = new Car("259795","0547896541",'S',600.00);
        Car[] cars3 = {cars,cars1,cars2};
        System.out.println(result(cars3,"259560"));
    }
    private String licences ;//לוחית רישוי
    private String ownerNum;//מספר טלפון
    private char Status;//מצב הרכב
    private double cost;//מחיר הטיפול

    public Car(String licences, String ownerNum, char status, double cost) {
        this.licences = licences;
        this.ownerNum = ownerNum;
        Status = status;
        this.cost = cost;
    }
    public void endWork(double cost){
        if (this.Status == 'W'){
            this.cost=cost;
            this.Status ='E';
        }
    }
    public static boolean result (Car[] arr, String license){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].licences != license) {
                System.out.println("לא נמצא במערך");
            }else {
                System.out.println("נמצא במערך");
            }
            if (arr[i].Status == 'E'){
                System.out.println(arr[i].cost);
                return true;
            }else {
                System.out.println(arr[i].Status);
                return false;
            }
        }
        return false;
    }

}
