package classesMain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Trie {
        Set<String> trieSet;
        public Trie() {
            trieSet = new HashSet<>();
        }

        public void insert(String word) {
            trieSet.add(word);
        }

        public boolean search(String word) {
            return trieSet.contains(word);
        }

        public boolean startsWith(String prefix) {
           boolean flag = false;
            System.out.println(trieSet);
           for(String s : trieSet) {
               if(s.startsWith(prefix)) {
                   return true;
               }
           }
            return flag;
        }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("app");
        trie.insert("apple");
        trie.insert("beer");
        trie.insert("add");
        trie.insert("jam");
        trie.insert("rental");
        trie.search("apps");
        trie.search("app");
        System.out.println(trie.startsWith("beer"));
        System.out.println(trie.startsWith("jam"));
    }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

