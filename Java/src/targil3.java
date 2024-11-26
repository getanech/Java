public class targil3 {
    public static void main(String[] args) {
        String s = "Lionel.Messi";
        System.out.println(S(s));

    }
    public static boolean S (String s){
        if (s.startsWith(".") && s.endsWith(".")){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='.' && s.charAt(i-1) == '.'){
                return false;
            }
        }return s.contains(".");
    }
}
