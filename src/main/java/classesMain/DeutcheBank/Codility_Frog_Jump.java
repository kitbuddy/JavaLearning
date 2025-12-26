package classesMain.DeutcheBank;

public class Codility_Frog_Jump {
    public static void main(String[] args) {
        int X = 10; // starting point
        int Y = 85; // target point
        int D = 30; // step size
        System.out.println(Codility_Frog_Jump.findMinimumJump(X, Y, D));
    }

    private static int findMinimumJump(int x, int y, int d) {
        int distance = y-x;
        /*Why (distance + D - 1) / D works?
        It simulates ceil without using floating point
        Preferred in interviews and production code*/
        /* I compute the required distance and divide by jump length,
         rounding up using integer arithmetic to get the minimum jumps in O(1) time. */
        return( distance + d - 1)/d;
    }
}
