package classesMain.DeutcheBank;

public class Codility_PermCheck {
    public static void main(String[] args) {
        int[] A = {4, 1, 3,2};
        System.out.println(Codility_PermCheck.isArrayPerm(A));
    }

    private static int isArrayPerm(int[] arr) {

        int n = arr.length;
        boolean[] seen = new boolean[n + 1];

        for (int val : arr) {

            // out of range check
            if (val < 1 || val > n) {
                return 0;
            }

            // duplicate check
            if (seen[val]) {
                return 0;
            }

            // mark as seen
            seen[val] = true;
        }

        return 1;
    }

//    private static int isArrayPerm1(int[] Arr) {
//
//        int missing = 0;
//
//        for (int i = 1; i < Arr.length + 1; i++) {
//            missing ^= i;
//        }
//        for (int i : Arr) {
//            missing ^= i;
//        }
//        return missing == 0 ? 1 : 0;
//
//    }
}
