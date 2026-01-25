package classesMain.PracticeMakeTheManPerfect;

import java.util.Arrays;

public class SortingLinearScan {
    public static void main(String[] args) {
        int[] arr = {7,7,8};
        System.out.println(SortingLinearScan.getPairs(arr));
    }

    private static boolean getPairs(int[] arr) {
        int[] newArr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(newArr));
        if (arr.length % 2 != 0) {
            return false; // odd number of elements can't be fully paired
        }
        for(int i = 0; i < newArr.length-1; i+=2) {
            if(newArr[i] != newArr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
