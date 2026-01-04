package classesMain.DeutcheBank;

import java.util.ArrayList;
import java.util.List;

public class Codility_ChoclatesByNumbers {

    public static void main(String[] args) {
        int N = 10, M = 4;
        Codility_ChoclatesByNumbers.solution( N, M);
    }

    public static int solution(int N, int M) {

        int result = 0;
        List<Integer> eatenChoclates = new ArrayList<>(N);

        for (int i = 0; i < 4*N; i += M) {
            while (!eatenChoclates.contains(i)) {
                eatenChoclates.add(i);
            }
        }
        return result;
    }
}
