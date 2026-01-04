//package classesMain.DeutcheBank.LCS;
//
//import java.io.Console;
//
//public class LongestCommonSubSequence {
//
//        // Returns length of LCS for s1[0..m-1], s2[0..n-1]
//        static int lcsRec(String s1, String s2, int m,
//                          int n, int[, ] memo) {
//            // Base Case
//            if (m == 0 || n == 0)
//                return 0;
//
//            // Already exists in the memo table
//            if (memo[m, n] != -1)
//            return memo[m, n];
//
//            // Match
//            if (s1[m - 1] == s2[n - 1]) {
//                return memo[m, n]
//                = 1 + lcsRec(s1, s2, m - 1, n - 1, memo);
//            }
//
//            // Do not match
//            return memo[m, n]
//            = Math.Max(lcsRec(s1, s2, m, n - 1, memo),
//                    lcsRec(s1, s2, m - 1, n, memo));
//        }
//
//        static int lcs(String s1,String s2){
//            int m = s1.length();
//            int n = s2.length();
//
//            int[ , ] memo = new int[m + 1, n + 1];
//
//            // Initialize memo array with -1
//            for (int i = 0; i <= m; i++) {
//                for (int j = 0; j <= n; j++) {
//                    memo[i, j] = -1;
//                }
//            }
//
//            return lcsRec(s1,s2,m,n,memo);
//        }
//
//        public static void Main() {
//            String s1 = "AGGTAB";
//            String s2 = "GXTXAYB";
//
//            System.out.println(lcs(s1, s2));
//        }
//    }
//}
