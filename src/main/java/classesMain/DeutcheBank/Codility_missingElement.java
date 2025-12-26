package classesMain.DeutcheBank;

public class Codility_missingElement {
    public static void main(String[] args) {
        int[] A = {1,2,3,5};
//        System.out.println(Codility_missingElement.getMissingElement(A));
        System.out.println(Codility_missingElement.getMissingElementUsingXOR(A));
    }

    private static int getMissingElementUsingXOR(int[] arr) {
        int missing = 0;
        for (int i = 1; i <= arr.length+1; i++) {
            missing ^=i;
        }
        for (int i: arr) {
            missing ^= i;
        }
//        System.out.println(missing);
        return missing;
    }

    private static int getMissingElement(int[] arr) {
        // total sum for series array should be (N+1) * (N+2) /2

        int totalCurrentSum = 0;
        int arrLength = arr.length;
        for(int num: arr) {
            totalCurrentSum+=num;
        }

        int expectedSum = ((arrLength+1) * (arrLength+2)) /2;
        return expectedSum - totalCurrentSum;
    }


}
