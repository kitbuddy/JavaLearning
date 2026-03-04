package classesMain.PracticeMakeTheManPerfect;

import java.util.List;
import java.util.stream.Collectors;

public class GetSimilarStrings2 {

    public static void main(String[] args) {
        List<String> list = List.of("swiss", "cross", "miss", "wheels", "silent", "listens", "batch", "tabular", "tab");
        String str = "bat";  // Characters to check, including duplicate handling.

//        System.out.println(findWordsContainingAllCharsUsingMaps(list, str));
        System.out.println(findWordsContainingAllCharsUsingMaps2(list, str));
    }

    private static List<String> findWordsContainingAllCharsUsingMaps(List<String> list, String str) {
        // Use `filter` to find all matching words.
        return list.stream()
                .filter(s -> str.chars()
                        .allMatch(c -> // For each character in `str`, check if the word contains it
                                s.chars().filter(ch -> ch == c).count()
                                        >= str.chars().filter(ch -> ch == c).count()
                        )
                )
                .collect(Collectors.toList()); // Collect the matching words into a list
    }

    private static List<String> findWordsContainingAllCharsUsingMaps2(List<String> list, String str) {

        return list.stream()
                .filter(s -> str.chars()
                        .allMatch(c ->
                                s.chars().filter(ch -> ch == c).count()
                                        >= str.chars().filter(ch-> ch == c).count()
                        )
                ).toList();

    }

}