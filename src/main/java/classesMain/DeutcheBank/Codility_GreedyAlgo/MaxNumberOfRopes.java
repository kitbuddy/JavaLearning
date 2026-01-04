package classesMain.DeutcheBank.Codility_GreedyAlgo;

public class MaxNumberOfRopes {

    public static void main(String[] args) {

        // How many ropes can be formed of length K
        //👉 The function should return number of ropes formed,
        //❌ not the maximum number of pieces used to form one rope.

        int[] A = {1,2,3,4,1,1,3};
        int K = 4;
        System.out.println(getMaxNumberofRopes(A, K));
    }

    private static int getMaxNumberofRopes(int[] A, int K) {
        int result = 0;
        int sum =0;

        for(int i = 0; i < A.length; i++) {
                sum += A[i];
                if(sum >= K) {
                    result++;
                    sum = 0;
                }
        }
        return result;
    }
}
