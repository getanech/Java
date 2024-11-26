public class Main {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70};
        System.out.println(isbalanced(array));
    }
    public static boolean isbalanced(int[] arr){
        int length = arr.length;
        if (length < 3 && length % 2 == 0){
            return false;
        }
        // בדוק את הערכים לפני התא המרכזי
        int middleindex = length / 2;
        for (int i = 0; i < middleindex; i++) {
            if (arr[i] >= arr[middleindex]){
                return true;
            }
        }
        // בדוק את הערכים אחרי התא המרכזי
        for (int i = middleindex+1; i < length; i++) {
            if (arr[i] <= arr[middleindex]){
                return true;
            }
        }
        return false;
    }
}