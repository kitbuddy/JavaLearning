package classesMain;

import java.util.*;


// There are N empty glasses with a capacity of 1, 2, ..., N liters
// (there is exactly one glass of each unique capacity). You want to pour exactly
// K liters of water (partially filled).
// What is the minimum number of glasses that you need to contain K liters of water?


public class Deautche_bank_3 {

    public static void main(String[] args) {
        int N = 10;
        int K = 5;
        System.out.println(Deautche_bank_3.getMinimumGlasses(N,K));
    }

    private static int getMinimumGlasses(int N, int K) {
        int minimumNumberOfGlasses = 0;
//
//        if(N == 1 && K>N) {
//            return -1;
//        }

        List<Integer> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            list.add(i);
        }

        int sum = K;
        for(int i = N; i >= 1; i--) {
            if(sum > 0) {
                sum -=  i;

                if(sum < 0) {
                    sum = sum+i;
                } else {
                    res.add(i);

                }
            }

            if(sum == 0) {
                System.out.println(res);
               minimumNumberOfGlasses =  res.size();
               break;
            }

        }

        return minimumNumberOfGlasses;
    }
}