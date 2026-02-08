package classesMain.PracticeMakeTheManPerfect;

public class WindowSum {
    // find max sum in window of size k
    public static void main(String[] args) {
        int[] arr = {5, 2, -1, 0, 3};
        int k =3;
        System.out.println(WindowSum.maxSum(arr, k));
    }

    private static int maxSum(int[] arr, int k) {
        int n = arr.length;
        int window_total = 0;
        for(int i =0; i<k; i++) {
            window_total += arr[i];
        }

        int max_sum = window_total;

        for(int i = k; i < n; i++) {
            window_total = arr[i] - arr[i-k];
            max_sum = Math.max(max_sum, window_total);
        }
        return max_sum;
    }
}
