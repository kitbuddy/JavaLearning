package classesMain.DeutcheBank;

import java.util.*;

public class CountNonDivisible {

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 3, 6};
        System.out.println(Arrays.toString(CountNonDivisible.getNonDivisible(array)));
    }

    private static int[] getNonDivisible(int[] array) {
        int n = array.length;
        int[] nonDivisors = new int[n];
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int k : array) {
            freqMap.put(k, freqMap.getOrDefault(k, 0) + 1);
        }

        for(int i =0; i<n; i++) {
            int num = array[i];
            int divisorCountInArray = 0;

            for(int d=1; d*d <= num; d++) {
                if(num % d == 0) {
                    if(freqMap.containsKey(d)) {
                        divisorCountInArray += freqMap.get(d);
                    }

                    if(d!=num/d && freqMap.containsKey(num/d)) {
                        divisorCountInArray += freqMap.get(num /d);
                    }
                }

                nonDivisors[i] = n - divisorCountInArray;
            }
        }

        return nonDivisors;
    }


}
