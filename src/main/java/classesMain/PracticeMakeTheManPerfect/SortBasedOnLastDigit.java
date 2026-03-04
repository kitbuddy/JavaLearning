package classesMain.PracticeMakeTheManPerfect;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortBasedOnLastDigit {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(15,23,35,47,58,33,62,44,36));

        SortBasedOnLastDigit.getSortedList(list);
    }

    private static void getSortedList(List<Integer> list) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if( o1%10 > o2%10 ) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        list.sort(comparator);
        System.out.println(list);
    }
}
