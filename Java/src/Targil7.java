public class Targil7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 11, 10, 9, 8};
//        System.out.println(Pisga(arr));

        int m = arr[0];
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            System.out.println(s);
        }
//    public static int Pisga(int[] array) {
//        if (array == null || array.length < 3) {
////            return -1; // מערך צריך להיות באורך של לפחות 3 עבור סדרה עולה-יורדת
//        }
//        int n = array.length;
//        int peakIndex = -1;
//
//        // חפשו את אינדקס הפסגה
//        for (int i = 1; i < n - 1; i++) {
//            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
//                peakIndex = i;
//                break;
//            }
//        }
//        if (peakIndex == -1) {
//            return -1; // לא נמצא פסגה
//        }
//        // בדוק אם החלק העולה והחלק היורד תקינים
//        for (int i = 0; i < peakIndex; i++) {
//            if (array[i] >= array[i + 1]) {
//                return -1; // החלק הראשון אינו סדרה עולה
//            }
//        }
//
//        for (int i = peakIndex; i < n - 1; i++) {
//            if (array[i] <= array[i + 1]) {
//                return -1; // החלק השני אינו סדרה יורדת
//            }
//        }
//
//        return peakIndex;
//    }
    }
}
