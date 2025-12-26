package classesMain.DeutcheBank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Codility_L6_distinct {

    /*Write a function

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the number of distinct values in array A.

For example, given array A consisting of six elements such that:

 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].*/

    public static void main(String[] args) {
        int[] arr = {2,1,1,2,3,1};
//        System.out.println(Codility_L6_distinct.getDistinct(arr));
        System.out.println(Codility_L6_distinct.getDistinctKeys(arr));


    }

    private static int getDistinctKeys(int[] arr) {
        Set<Integer> distinctSet = new HashSet<>();

        for(int i: arr) {
            distinctSet.add(i);
        }
        return distinctSet.size();
    }

    // no need to use hasmmap to get frequescies ,, we just need keys so getDistinctKeys is correct
    /*private static int getDistinct(int[] arr) {
        Map<Integer, Integer> distimctMap = new HashMap<>();

        for(int i: arr) {
            distimctMap.put(i, distimctMap.getOrDefault(i, 0) +1);
        }
        Set<Integer> distictSet = new HashSet<>(distimctMap.keySet());
        return distictSet.size();
    }*/
}
