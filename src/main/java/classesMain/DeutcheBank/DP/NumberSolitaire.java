package classesMain.DeutcheBank.DP;

public class NumberSolitaire {

    public static void main(String[] args) {
        int[] A = {1,-2,0,9,-1,-2};
        System.out.println(getMaxResultOnBoard(A));

    }

    private static int getMaxResultOnBoard(int[] A) {
        int[] dp = new int[A.length];

        dp[0] = A[0];
        for (int i = 1; i<A.length; i++) {
//            if( i == 0) {
//            } else {
                int maxOnThisSquare = Integer.MIN_VALUE;

                for(int j =1; j<=6; j++) { // because dice can only have 6 faces
                    if(i-j >=0) {
                        maxOnThisSquare = Math.max(maxOnThisSquare, dp[i-j]);
                    }
                    dp[i] = maxOnThisSquare + A[i];
                }

        }

        return dp[dp.length -1];

    }

    private static int getMaxResultOnBoardNew(int[] A) {
        int n = A.length;
        int[] dp = new int[n];

        dp[0] = A[0];

        for (int i = 1; i < n; i++) {
            int maxPrev = Integer.MIN_VALUE;

            for (int j = 1; j <= 6; j++) {
                if (i - j >= 0) {
                    maxPrev = Math.max(maxPrev, dp[i - j]);
                }
            }

            dp[i] = maxPrev + A[i];
        }

        return dp[n - 1];
    }

}
