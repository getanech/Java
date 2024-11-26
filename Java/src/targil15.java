public class targil15 {
    public static void main(String[] args) {
        int[] arr = {13, 6, 3, 13, 6, 3, 13, 6, 3};
        System.out.println(istriangular(arr));
    }
    public static boolean istriangular(int[] arr){
        int length = arr.length;
        if(length % 3!=0){
            return false;
        }
        int partsize = length / 3;
        for (int i = 0; i + 2 * partsize < arr.length; i++) {
            if (arr[i] != arr[i+partsize] || arr[i] != arr[i + 2 * partsize]){
                return false;
            }
        }
        return true;
    }
}
