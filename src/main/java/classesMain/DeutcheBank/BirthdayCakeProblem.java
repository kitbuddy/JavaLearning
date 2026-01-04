package classesMain.DeutcheBank;

import java.util.*;

public class BirthdayCakeProblem {
    // find number of occurrences of max height candle.
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,1,2,3,9,9,9,9,3,3,3,3,3,3,4);
        System.out.println(BirthdayCakeProblem.birthdayCakeCandles(myList));
    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        Map<Integer, Integer> candleMap = new HashMap<>();
        int result = 0;
        for(int height: candles) {
            candleMap.put(height, candleMap.getOrDefault(height, 0) +1);
        }

        int maxValue = 0;
        for (Map.Entry<Integer, Integer> myEntrySet : candleMap.entrySet()) {
            if(myEntrySet.getKey() > maxValue) {
                maxValue = myEntrySet.getKey();
            }
           result = candleMap.get(maxValue);
        }

        return result;
    }

}
