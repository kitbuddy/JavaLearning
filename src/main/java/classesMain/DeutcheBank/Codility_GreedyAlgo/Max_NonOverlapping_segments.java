package classesMain.DeutcheBank.Codility_GreedyAlgo;

public class Max_NonOverlapping_segments {

    public static void main(String[] args) {
        int[] A = {1,3,7,9,9};
        int[] B = {5,6,8,9,10};
        System.out.println(getMaxNonOverlappingSet( A,B));
    }

    private static int getMaxNonOverlappingSet(int[] A, int[] B) {
        int count = 1;
        int lastEnd = B[0];
        for(int i = 1; i<A.length; i++) {
            if(A[i] > lastEnd) {
                count++;
                lastEnd = B[i];
            }
        }
        return count;
    }


//    private static void getMaxNonOverlappingSet(int[] A, int[] B) {
//        Set<int[]> newSet = new HashSet<>();
//        for(int i =0; i<=A.length; i++) {
//            for (int j = 1; j<B.length ; j++) {
//                while (i < j) {
//                    if (newSet.size() == 3) {
//                        break;
//                    }
//                    System.out.println("B[i]" + B[i]);
//                    System.out.println("A[j]" + A[j]);
//                    if (B[i] < A[j]) {
//                        newSet.add(new int[]{A[i], B[i]});
//                        i = j;
//                    }
//                }
//            }
//            System.out.println(newSet.toArray().toString());
//        }
//
//    }
}
