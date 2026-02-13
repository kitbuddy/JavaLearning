package classesMain.PracticeMakeTheManPerfect;

import java.util.HashMap;
import java.util.Map;

public class arrayWithStrings {

    public static void main(String[] args) {
        String[] strArr = {"bat", "ca", "mat", "tab", "cal"};
        arrayWithStrings.findSimilarStrings(strArr, "at");
    }

    private static void findSimilarStrings(String[] strArr, String at) {
       Map<Character, Integer> targetMap = getMap(at);
       Map<Character, Integer> currentMap;
       for (String s : strArr) {
          currentMap = getMap(s);
          if(findIfWordMatches(currentMap, targetMap)) {
              System.out.println(s + " matches");
          } else {
              System.out.println(s + " does not matches");
          }

       }
    }

    private static boolean findIfWordMatches(Map<Character, Integer> currentMap, Map<Character, Integer> targetMap) {
        for (Character val: targetMap.keySet()) {
            if(!currentMap.containsKey(val)) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> getMap(String at) {
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : at.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

}
