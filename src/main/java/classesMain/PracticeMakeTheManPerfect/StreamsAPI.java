package classesMain.PracticeMakeTheManPerfect;

import java.util.List;

public class StreamsAPI {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,3,6,4,3);
        List<String> list1 = List.of("bat", "Cat", "batter", "tab");
//        System.out.println(StreamsAPI.getFilteredEvenNumbers(list));
//        System.out.println(StreamsAPI.getFilteredNumbersGreaterThan2(list));
//        System.out.println(StreamsAPI.getMapOfCapitalLetters(list1, "bat"));
//        System.out.println(StreamsAPI.getSquareMapOfEachCharacter(list));
//        System.out.println(StreamsAPI.getMinValue(list));
        System.out.println(StreamsAPI.getMaxValue(list));
    }

    private static List<Integer> getFilteredEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(s -> s %2 == 0)
                .toList();
    }

    private static List<Integer> getFilteredNumbersGreaterThan2(List<Integer> list) {
        return list.stream()
                .filter(s -> s > 3)
                .toList();
    }

    private static List<String> getFilteredNumbersContains(List<String> list, String str) {
        return list.stream()
                .filter(s ->
                    s.contains("b") && s.contains("a") && s.contains("t")
                )
                .toList();
    }

    private static List<String> getMapOfCapitalLetters(List<String> list, String str) {
        return list.stream()
                .map(String:: toUpperCase)
//                .map( s-> s.toUpperCase())
                .toList();
    }

    private static List<Integer> getSquareMapOfEachCharacter(List<Integer> list) {
        return list.stream()
                .map(a -> a*a)
                .toList();
    }

    private static Integer getMinValue(List<Integer> list) {
        return list.stream().min((x,y) -> x.compareTo(y)).get();
    }
    private static Integer getMaxValue(List<Integer> list) {
        return list.stream().max((x,y) -> x.compareTo(y)).get();
    }



}
