public class Targil13 {
    public static void main(String[] args) {
        //print("Java is a good language",'a');
        int[] arr = {1, 9, 2, 8, 4, 7, 7, 4, 12};
        System.out.println(print2(arr));

    }

    public static void print(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println(str.substring(i));
            }
        }
    }
    public static boolean print2(int[] array) {
        boolean isEvenSorted = true;
        boolean isOddSorted = true;

        for (int i = 0; i < array.length-2; i+=2) {
            if (array[i] > array[i + 2]){
                isEvenSorted = false;
                break;
            }
        }
        for (int i = 1; i < array.length - 2; i += 2) {
            if (array[i] < array[i + 2]) {
                isOddSorted = false;
                break;
            }
        }
        return isEvenSorted && isOddSorted;
    }
}

