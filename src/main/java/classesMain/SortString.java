package classesMain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {
     List<String> fixedList = Arrays.asList("Apple", "Banana", "Cherry");
     public List<String> sortArrayList() {
          List<String> sortedList = fixedList.stream().sorted().collect(Collectors.toList());
          return sortedList;
     }
}
