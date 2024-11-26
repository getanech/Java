public class targil2 {
    public static void main(String[] args) {
        int[] arr = {180, 3, 7,0,13,131, 444};
        int s = arr.length-1;
        System.out.println();
        //System.out.println(print(arr));
    }

    public static boolean print(int[] arr) {
        int length = arr.length;
        if (length % 2 == 0) {
            return false;
        }
        int index = length / 2;
        if (arr[index] != 0) {
            return false;
        }

        for (int i = 0; i < index; i++) {
            if (arr[i] < 0 || arr[i] > 9) {
                return false;
            }
        }
        for (int i = index+1; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] <= 9) {
                return false;
            }
        }
        return true;
    }
}


