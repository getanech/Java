public class Targil9 {
    public static void main(String[] args) {
        int[] a = {13, 6, 3, 13, 6, 3, 13, 6, 3};
        int[] b = {1, 1, 1, 1, 1, 1};
        int[] c = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3};
        int[] d = {1, 2, 1, 2, 2, 2};
        System.out.println(isTriangularArray(d));

    }
    public static boolean isTriangularArray(int[] arr) {
        int n = arr.length;
        // בדוק אם אורך המערך הוא כפולה של 3
        if (n % 3 != 0) {
            return false;
        }
        int partLength = n / 3;

        // השווה את שלושת החלקים
        for (int i = 0; i < partLength; i++) {
            if (arr[i] != arr[i + partLength] || arr[i] != arr[i + 2 * partLength]) {
                return false;
            }
        }

        return true;
    }
}
