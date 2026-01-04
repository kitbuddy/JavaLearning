package classesMain.DeutcheBank;

import java.util.*;
import java.util.stream.Collectors;

public class GetSemiPrimes {
    public static void main(String[] args) {
        int[] p = {1,4,16};
        int[] q = {26, 10, 20};
        int  N = 26;
//        System.out.println(checkNumberIsPrime(50));
        System.out.println(getSemiPrimeList(p, q, N));
//        System.out.println(getListOfPrimes(1, 26));
//        System.out.println(getListOfPrimes(1, 26).size());
    }

    private static Set<Integer> getSemiPrimeList(int[] p, int[] q, int N) {
        Set<Integer> semiPrimeCountSet = new HashSet<>();
        List<Integer> primeNumberList = new ArrayList<>();
        int count =0;
        for(int i = 0; i < p.length ; i++ ) {
            primeNumberList = getListOfPrimes(p[i], q[i]);
            Arrays.sort(primeNumberList.toArray());

            for (int k = 0; k < primeNumberList.size(); k++) {
                for (int j = 1; j < primeNumberList.size(); j++) {
                    count++;
                }
            }
            System.out.println(count);
            semiPrimeCountSet.add(count);
        }
        return semiPrimeCountSet;
    }

    public static List<Integer> getListOfPrimes(int i, int j) {
        List<Integer> primeNumberList = new ArrayList<>();

        for (int k = i; k<=j; k++) {
            if(checkNumberIsPrime(k)) {
                primeNumberList.add(k);
            }
        }
    return primeNumberList;
    }


    private static boolean checkNumberIsPrime(int n) {
        if(n<=1) {return false;}
        for (int i =2; i * i <= n; i++) {
                if(n % i == 0) {
                    return false;
            }
        }
        return true;
    }
}
