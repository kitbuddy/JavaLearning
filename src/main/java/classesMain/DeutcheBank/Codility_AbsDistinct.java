package classesMain.DeutcheBank;

import java.util.HashSet;
import java.util.Set;

public class Codility_AbsDistinct {
    public static void main(String[] args) {
        int[] A = {-5, -3, -1, 0,3,6};
        System.out.println(getAbsoluteDistinctCount(A));
        System.out.println(getAbsoluteDistinctCountCaterpillar(A));
    }

    // this is O(n)
    private static int getAbsoluteDistinctCount(int[] A) {

        Set<Integer> mySet = new HashSet<>();
        for (int i : A) {
            mySet.add(Math.abs(i));
        }
        return mySet.size();
    }

    // n caterpillar approach or Optimal Greedy / Two Pointer below it is Two-pointer
    //O(N) - time
    //O(1) - Extra space

    private static int getAbsoluteDistinctCountCaterpillar(int[] A) {
        int left = 0;
        int right = A.length - 1;
        int distinctCount = 0;
        int lastSeen = -1;  // to track previous seen absolute

        while (left <= right) {
            int leftAbs = Math.abs(A[left]);
            int rightAbs = Math.abs(A[right]);

            int currentMax = Math.max(leftAbs, rightAbs);

            if (currentMax != lastSeen) {
                distinctCount++;
                lastSeen = currentMax;
            }

            if (leftAbs > rightAbs) {
                left++;
            } else if (rightAbs > leftAbs) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return distinctCount;
    }

}
