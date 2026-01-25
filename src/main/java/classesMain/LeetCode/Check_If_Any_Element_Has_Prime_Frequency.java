package classesMain.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Check_If_Any_Element_Has_Prime_Frequency {

    public static void main(String[] args) {
//        int[] nums =  {8, 8, 8, 6, 6, 6, 6};
        int[] nums =  {1,2,3,4,5,4};
        System.out.println(Check_If_Any_Element_Has_Prime_Frequency.checkPrimeFrequency(nums));
    }

    public static boolean checkPrimeFrequency(int[] nums) {
        boolean ans = false;
        Map<Integer, Integer> maps = new HashMap();
        for (int i: nums) {
            maps.put(i, maps.getOrDefault(i, 0) +1);
        }
        System.out.println(maps);
        for(Integer i: maps.values()) {
            ans =  checkPrime(i);
        }
        if(ans == true) {
            return  ans;
        }
        return ans;
    }

    private static boolean checkPrime(Integer n) {
        if(n<2) {
            return false;
        }
        for(int i =2; i<Math.sqrt(i); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
