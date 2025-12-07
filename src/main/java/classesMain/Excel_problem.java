package classesMain;

public class Excel_problem {
    // my first self solution **
    // Excel column name from a given column number
    // A=1, B=2, AA=27

    public static void main(String[] args) {

        System.out.println(Excel_problem.getExcelIndex(701));
    }

    private static String getExcelIndex(int n) {
        StringBuilder str = new StringBuilder();
        while (n > 0) {
            n--;
            int remainder = n%26;
            char myCharacter = (char)('A' + remainder);
            n = n/26;
            str.append(myCharacter);
        }

        return str.reverse().toString();
    }
}
