package classesMain.DeutcheBank;

public class MissingNumberInAnArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        System.out.println(findMissingNumber(arr));
    }

    private static int findMissingNumber(int[] arr) {
        int xor = 0;
        for(int i = 1; i<=arr.length+1; i++) {
            xor ^= i;
        }
        for(int i :arr) {
            xor ^=i;
        }
        return xor;
    }
}
