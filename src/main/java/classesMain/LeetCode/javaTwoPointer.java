package classesMain.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class javaTwoPointer {

    public static void main(String[] args) {
        int[] myList = {1,2,3,4};
        System.out.println("ans");
        System.out.println(javaTwoPointer.getTwoNumbers(myList));
    }

    private static List<Integer> getTwoNumbers(int[] myList) {

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<myList.length; i++ ) {
            for (int j = myList.length-1; j >i; j--) {
                System.out.println("{left : " + i +" right : " + j + "}");

//                list.add(myList[i]);
//                list.add(myList[j]);
//                System.out.println(list);
            }
        }

        System.out.println("final List");
        return list;

    }

}
