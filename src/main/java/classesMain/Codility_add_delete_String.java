package classesMain;

public class Codility_add_delete_String {


    public static String appendAndDelete(String s, String t, int k) {
        int counterCommon = 0;
        int counterRun = Math.min(s.length(), t.length());
        for(int i=0; i<counterRun; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                counterCommon ++;
            } else {
                break;
            }
        }


        int extra = s.length() - counterCommon;
        int append = t.length() -counterCommon;
        return ((extra + append) <= k )? "Yes": "No";
//        int n = (k -1)/2;
//        for (int i = 0; i < n+1; i++) {
//            s = s.substring(0, s.length() - 1);
//            System.out.println(s);
//            if(s.isEmpty()) {
//               break;
//            }
//        }
//            s = s + t.substring(s.length(), t.length());
//
//        return s.compareTo(t) == 0? "Yes":  "No" ;
//    }

    }


    public static void main(String[] args) {
//        System.out.println(Codility_add_delete_String.appendAndDelete("ashley", "ash", 2));
        System.out.println(Codility_add_delete_String.appendAndDelete("abcd", "abcdert", 10));
    }
}
