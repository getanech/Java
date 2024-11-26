import java.util.Scanner;

public class targil14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int countNumbers = 0;
        int SumPositive = 0;
        int equalPairsCount = 0;
        while (true){
            System.out.println("\"הזן זוג שלמים (או זוג מספרים מנוגדים כדי לעצור\n");
            int num1= scanner.nextInt();
            int num2 = scanner.nextInt();

            if (num1 == - num2){
                break;
            }
            countNumbers +=2;
            if (num1 > 0){
                SumPositive+=num1;
            }
            if (num2 > 0){
                SumPositive+=num2;
            }
            if (num1 == num2){
                equalPairsCount++;
            }
        }
        System.out.println(  countNumbers);
        System.out.println( SumPositive);
        System.out.println( equalPairsCount);
    }

}
