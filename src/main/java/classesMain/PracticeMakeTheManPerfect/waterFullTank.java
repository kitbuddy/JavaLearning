package classesMain.PracticeMakeTheManPerfect;

public class waterFullTank {

    public static void main(String[] args) {
        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(waterFullTank.getMaxVolume(arr));
    }

    private static int getMaxVolume(int[] arr) {

        int i =0;
        int j = arr.length -1;
        int totalSize = 0;

        while(i < j) {
            totalSize = Math.max(totalSize, (j-i) * Math.min(arr[i], arr[j]));
            if(arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }

        return totalSize;
    }
}
