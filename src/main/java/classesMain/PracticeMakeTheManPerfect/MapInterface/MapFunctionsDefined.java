package classesMain.PracticeMakeTheManPerfect.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapFunctionsDefined {

    public static void main(String[] args) {
        String[] stringArr = {"dog", "dog", "cat", "horse", "lion", "horse"};

        MapFunctionsDefined.getMapforElements(stringArr);
    }

    private static void getMapforElements(String[] stringArr) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : stringArr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        System.out.println(map);

        if(map.containsKey("horse")) {
            System.out.println("array contains horse times : " + map.get("horse") );
        }
        map.computeIfPresent("dog",  (k, v) -> v - 1);
//            System.out.println("key is: " + k );
//            System.out.println("value is: " + v);
//             v - 1;
//        });

        System.out.println("Map after computeIfPresent ");
        System.out.println(map);
        System.out.println("Map after computeIfAbsent ");

        System.out.println("Map after EntrySet ");

        System.out.println(map.containsKey("dog"));
        System.out.println(map.containsKey("cat"));
        System.out.println(map.containsValue(7));

        System.out.println("---------entrySet-------------");
        for (Map.Entry<String, Integer> entrySet: map.entrySet()) {
            System.out.print(entrySet);
        }

        for (Map.Entry<String, Integer> entrySet: map.entrySet()) {
            System.out.println(" \n ----------------------");

            if(entrySet.getValue().equals(1)) {
                System.out.println(entrySet.getKey());
            }
        }

        if (map.containsValue(1)) {
            System.out.println("cat value: " + map.get("cat"));
        }

        System.out.println("Map before putIfPresent ");
        System.out.println(map);

//        map.putIfAbsent("girrafe", 0);
        map.putIfAbsent("girrafe", map.size() + 1);
        System.out.println("Map after putIfPresent ");
        System.out.println(map);
        System.out.println(" \n ----------------------");
        System.out.println("Map before computeIfAbsent ");

        // valueGoingToAssociateToCheetah will be the value of Map after adding new key
        // could be use to serial number the last key getting added
        map.computeIfAbsent("parrot", valueGoingToAssociateToCheetah -> {
            System.out.println("valueGoingToAssociateToCheetah");
            System.out.println(valueGoingToAssociateToCheetah);
            System.out.println("valueGoingToAssociateToCheetah");

//            return k.length();
            return valueGoingToAssociateToCheetah.length();
        });
        System.out.println("Map after computeIfAbsent ");
        System.out.println(map);
        System.out.println(" \n ----------------------");


        System.out.println("map.keySet()");
        System.out.println(map.keySet());

        if(!map.isEmpty()) {
            System.out.println(map.get("tiger"));
        }

        if(map.get("tiger") != null) {
            System.out.println("Tiger is present with value: " + map.get("tiget"));
        } else {
            System.out.println("Tiger is not present");
        }

        map.putIfAbsent("monkey", 8);
        map.putIfAbsent("monkey", 10);
        System.out.println(" \n ----------------------");

        System.out.println(map);

        map.replace("dog", map.get("dog"), 7);
        System.out.println(map);

        map.replace("lion", 2);
        System.out.println(map);

        map.replace("lion", 3, 4); // conditional update
        //Condition: This is a conditional update; the replacement happens only
        // if "lion" is currently mapped to the value 2 (the old value).

        System.out.println(map);

        System.out.println(" \n ----------------------");
        map.remove("cat");
        map.remove("horse", 3);

        System.out.println("after conditional remove as " +
                "3 for horse else dont remove" + map);
        map.remove("horse", 2);

        map.replaceAll((k, v) -> v * 2);
        System.out.println(map);
        System.out.println(" \n ----------------------");

        System.out.println(map.values());
        for(Integer value : map.values()) {

            if(value > 10) {
                System.out.println(value);
            }
        }

        Map<String, Integer> map2 = new HashMap<>();

        map2.put("apple", 100);
        map2.put("mango", 200);

        map.putAll(map2);
        System.out.println(map);
        System.out.println("merging cat now if not present");

        map.merge("cat", 110, (oldValue, newValue) -> oldValue + newValue);
        System.out.println(map);

        System.out.println("merging lion now");

        map.merge("lion", 110, (oldValue, newValue) -> oldValue + newValue);

        map2.put("lion", 1000);
        System.out.println(map);

        // testing contains in entry set
        if(map.entrySet().contains("lion")) {
            System.out.println("lion testing");
        }


        // testing contains in entry set
//        if(map.keySet().contains("lion")) {
        if(map.containsKey("lion")) {
            System.out.println("----> lion is present and testing");
        }
//        System.out.println(map);
        System.out.println();
        System.out.println(" \n ---------for each-------------");

        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });

        System.out.println(" Are the maps equal? --> " + map2.equals(map));

        map2.clear();
        System.out.println(map2);

        map2.putAll(map);
        System.out.println(" Are the maps equal now? --> " + map2.equals(map));

        System.out.println("map hashcode -> " + map.get("lion").hashCode());
        System.out.println("map2 hashcode -> " + map2.get("lion").hashCode());

        System.out.println(map.get(0));
        System.out.println(map.get("apple"));
        System.out.println(map.get("apple").hashCode());
    }

}
