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

            for(int j=1; j*j <= num; j++) {
                if(num % j == 0) {
                    if(freqMap.containsKey(j)) {
                        divisorCountInArray += freqMap.get(j);
                    }

                    if(j !=num/j && freqMap.containsKey(num/j)) {
                        divisorCountInArray += freqMap.get(num /j);
                    }
                }
                nonDivisors[i] = n - divisorCountInArray;
            }
        }

        return nonDivisors;
    }
}
