public class targil4 {
    public static void main(String[] args) {
        String str = "ABCCBA";
        System.out.println(palindrom(str));

    }

    public static boolean palindrom(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                return true;
            }
                  left++;
                  right--;
        }
        return false;
    }
}

