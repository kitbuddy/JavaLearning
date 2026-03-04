package classesMain.PracticeMakeTheManPerfect;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortBasedOnLengthOfString {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("aa", "bbb", "cc", "rrrr"));

        SortBasedOnLengthOfString.getSortedList(list);
    }

    private static void getSortedList(List<String> list) {

        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String o1, String o2) {
                if(o1.length() >= o2.length() ) {
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
