package classesMain.functionalProgramming;

import java.util.List;

public class findCommonWords {

    public static void main(String[] args) {
        String str = "bat";
        findWords();

    }
    private static void findWords() {

        List<String> myList = List.of("bat", "ball", "tab", "dog", "ball", "abt");

//        myList.stream().map(v -> v.contains("b") && v.contains("a") && v.contains("t")).toList().forEach(System.out::println);

        myList.stream().filter(v -> v.contains("b") && v.contains("a")
                && v.contains("t")).toList().forEach(System.out::println);
    }
    private static void findWords(String searchWord) {
        List<String> words = List.of("bat", "ball", "tab", "dog", "ball", "abt");

        words.stream()
                .filter(word -> containsAllCharacters(word, searchWord))
                .forEach(System.out::println);
    }

    private static boolean containsAllCharacters(String word, String searchWord) {
        return searchWord.chars()
                .allMatch(character -> word.contains(String.valueOf((char) character)));
    }

}
