package classesMain.LeetCode;

public class ContainerWithMostWater11 {

    //You are given an integer array height of length n.
    // There are n vertical lines drawn such that the two
    // endpoints of the ith line are (i, 0) and (i, height[i]).
    //
    //Find two lines that together with the x-axis form a
    // container, such that the container contains the most water.
    //
    //Return the maximum amount of water a container can store.
    //
    //Notice that you may not slant the container.

    public static int maxArea(int[] height) {
        int myArea = 0;
        // find the max height
        // find the second max height
        // find the longest distance between the second max and max height
        int counter = 0;
        int max = 0;
        for (int i=0; i<height.length-1; i++) {
            for (int j=height.length-1; j>0; j--) {
//                System.out.println(height[i] * height[j]);
//                myArea = Math.max(myArea,  height[i] * height[j]);
//                System.out.println("counter" + counter);
                int area = Math.min(height[i], height[j]) * (j-i);
                myArea = Math.max(myArea, area);
            }

        }
        return myArea;

    }

    public static void main(String[] args) {
//        int[]  height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[]  height = new int[]{1,1};

        System.out.println("max height is " + ContainerWithMostWater11.maxArea(height));
    }
}
