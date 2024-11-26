public class targil8 {
    public static void main(String[] args) {

    }

    public static boolean isCopyK(String s1, String s2) {
        if (s1.length() % s2.length() != 0) {
            return false;
        }
        int k = s1.length() / s2.length();

        // בניית מחרוזת על ידי חזרה על s2 k פעמים
            StringBuilder repeated = new StringBuilder();
            for (int i = 0; i < k; i++) {
                repeated.append(s2);
            }
            // בדיקה אם המחרוזת שנוצרה שווה ל-s1
            return s1.equals(repeated.toString());
        }
}



