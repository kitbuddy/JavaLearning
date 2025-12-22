package classesMain.DeutcheBank;

import java.util.HashMap;
import java.util.Map;

public class SharedFirstAndLastDigit {
    public static void main(String[] args) {
        int[] A = {130, 191,20,10};
        System.out.println(SharedFirstAndLastDigit.getMaxSum(A));
    }

    private static int getMaxSum(int[] intArray) {
        // are two numbers sharing their first and lst digit
        // if yes, store the sum and get the max
        // return the max sum

        // map create with first and lst digit as key

        // save the value if more value persists add it to it

        // get max for each key
        int maxSum = -1;
        Map<String, Integer> myMap = new HashMap<>();

        for(int i: intArray) {
            int leftDigit = getLeftDigit(i);
            int rightDigit = getRightDigit(i);
            String key = leftDigit + "," + rightDigit;

            if(myMap.containsKey(key)) {
                int previousSum = myMap.get(key);
                maxSum = Math.max(maxSum, previousSum + i);
                myMap.put(key, Math.max(previousSum, i));
            } else {
                myMap.put(key, i);
            }
        }

        for(Object o : myMap.entrySet()) {
            System.out.println(o);
        }

        return maxSum;
    }
//
//    private static Integer getMaxSumValue(int i) {
//
//    }

    private static boolean areTwoNumbersSharingFirstAndLastDigit(int firstNumber, int secondNumber) {
        return isRightMostDigitEqual(firstNumber, secondNumber) && isLeftMostDigitEqual(firstNumber, secondNumber);
    }

    private static boolean isLeftMostDigitEqual(int firstNumber, int secondNumber) {
        String firstNumberValue = String.valueOf(firstNumber);
        String secondNumberValue = String.valueOf(secondNumber);
        return firstNumberValue.charAt(0) == secondNumberValue.charAt(0);
    }

    private static boolean isRightMostDigitEqual(int firstNumber, int secondNumber) {
        return firstNumber % 10 == secondNumber%10;
    }

    private static int getLeftDigit(int num) {
        while(num >= 10 ) {
            num /= 10;
        }
        return num;

    }

    private static int getRightDigit(int firstNumber) {
        return firstNumber%10;
    }

//    int sum = -1;
//        for (int i = 0; i < intArray.length; i++) {
//            for (int j = i+1; j < intArray.length; j++) {
//                    if(areTwoNumbersSharingFirstAndLastDigit(intArray[i], intArray[j])) {
//                        sum = Math.max(sum, intArray[i] + intArray[j]);
//                    }
//            }
//        }
//        return sum;
}
