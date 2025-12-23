package classesMain.DeutcheBank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;

import static java.util.stream.Collectors.joining;

public class Codility_factorial {

        /*
         * Complete the 'extraLongFactorials' function below.
         *
         * The function accepts INTEGER n as parameter.
         */

        public static void extraLongFactorials(int n) {
            BigInteger factorial = BigInteger.valueOf(1);
            int i =1;
            if(n< 0) {
                System.out.println("cannot print factorial");
            }
            while(i <= n) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
                i++;

            }
//            System.out.println(factorial);
        }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Codility_factorial.extraLongFactorials(n);

        bufferedReader.close();
    }
}