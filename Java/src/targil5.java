public class targil5 {
    public static void main(String[] args) {
        String s = "A1b2C3d4";
        System.out.println(ChakedPassword(s));
    }

    public static boolean ChakedPassword(String str) {
        if (str.length() < 8) {
            return false;
        }
        if (!(str.startsWith("A"))) {
            return false;
        }
        if (!(str.endsWith("0") && str.endsWith("9"))) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
