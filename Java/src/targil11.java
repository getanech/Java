public class targil11 {
    public static void main(String[] args) {
        int number = 163458;
        System.out.println(exchange(number));
    }

    public static boolean exchange(int number) {
      String num = Integer.toString(number);
        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i-1)){
                return false;
            }
        }return true;
    }
}
