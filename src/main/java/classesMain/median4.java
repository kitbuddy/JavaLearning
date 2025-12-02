package classesMain;

import java.util.ArrayList;

public class median4 {

    public ArrayList findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList finalArr = new ArrayList();
        for(int i=0; i< nums1.length; i++) {
            for(int j=0; j< nums2.length; j++) {
                finalArr.add(nums2[j]);
            }
        }
        return finalArr;
    }

    public static void main(String[] args) {
        median4 median4 = new median4();
        System.out.println(median4.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}
