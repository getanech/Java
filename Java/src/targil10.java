import java.util.Arrays;

public class targil10 {
    public static void main(String[] args) {
       int[] b = {1,2,3,4,5,6,7,8,9};
       int[] c = {1,2,3,4,5,6,7,8,9};
        System.out.println(intersect(b,c));

    }
    public static boolean intersect(int[] b, int[] c){
        int num = 0;
        int num1=0;
        int num2 = 0;
        int[] d = {1,2,3,4,5};
        for (int i = 0; i < b.length; i++) {
            num+=b[i];
        }
        for (int i = 0; i < c.length; i++) {
            num1 += c[i];
        }
        for (int i = 0; i < d.length; i++) {
            num2+=d[i];
        }
        if (num == num2 && num1 == num2){
            return true;
        }
        return false;
    }
}
