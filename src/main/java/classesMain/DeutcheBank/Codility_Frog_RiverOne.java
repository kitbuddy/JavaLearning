package classesMain.DeutcheBank;

import java.util.HashSet;
import java.util.Set;

public class Codility_Frog_RiverOne {

    public static void main(String[] args) {
        int[] A = {1,2,1,4,2,3,5,4};
        int k = 5;
        System.out.println(Codility_Frog_RiverOne.getMinTime(A, k));
    }

    private static int getMinTime(int[] A, int k) {

        Set<Integer> myFallenLeafSet = new HashSet<>();

        for (int i = 0; i < A.length; i++) {

            int fallenLeaf = A[i];

            myFallenLeafSet.add(fallenLeaf);
            if(myFallenLeafSet.size() == k) {
                return i;
            }
        }
        return -1;
    }
}
