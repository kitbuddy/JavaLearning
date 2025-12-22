package classesMain.DeutcheBank;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] A =  {3, 1, 2, 4, 3, 4, 100};
        int P = 4;
        System.out.println(TapeEquilibrium.getSplitDifferenceWithMultipleOccurrencesOfValue(A, P));
    }

    private static int getSplitDifference(int[] arr, int value) {
        int totalSum = 0;
        int leftSum = 0;
        int diffEquilibrium = 0;
        for(int num: arr) {
            totalSum += num;
        }
        for (int i = 0; i < arr.length-1; i++) {
            leftSum += arr[i];
            if(arr[i+1] == value) {
                int rightSum = totalSum - leftSum;
                diffEquilibrium = Math.abs(rightSum - leftSum);
                break;
            }

        }
        return diffEquilibrium;
    }

    private static int getSplitDifferenceWithMultipleOccurrencesOfValue(int[] arr, int value) {
        int totalSum = 0;
        int leftSum = 0;
        int diffEquilibrium = 0;
        int minDiff = Integer.MAX_VALUE;
//        boolean found = false;
        for(int num: arr) {
            totalSum += num;
        }
        for (int i = 0; i < arr.length-1; i++) {
            leftSum += arr[i];
            if(arr[i+1] == value) {

                int rightSum = totalSum - leftSum;
                diffEquilibrium = Math.abs(rightSum - leftSum);
                minDiff = Math.min(minDiff, diffEquilibrium);
//                found = true;
            }

        }
        return minDiff;
    }
}
