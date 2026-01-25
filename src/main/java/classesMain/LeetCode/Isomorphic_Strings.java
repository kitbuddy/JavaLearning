package classesMain.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t) {

        Map< Character, Integer> sMap = new HashMap<>();

        for(char c: s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0)+1);
        }
        List<Integer> s_list = new ArrayList<>(sMap.values());
        System.out.println(s_list);

        Map< Character, Integer> tMap = new HashMap<>();

        for(char c: t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0)+1);
        }
        List<Integer> t_list = new ArrayList<>(tMap.values());
        System.out.println(t_list);

        if(s_list.equals(t_list)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Isomorphic_Strings.isIsomorphic("paper", "title");
    }
}
