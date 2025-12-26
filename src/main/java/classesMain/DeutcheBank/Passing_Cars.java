package classesMain.DeutcheBank;

public class Passing_Cars {

    public static void main(String[] args) {
        int[] A = {0,1,0,0,1,1};
        System.out.println(Passing_Cars.getPairs(A));
    }

    private static int getPairs(int[] carrArray) {
        int eastCars = 0;
        int passingcars = 0;

        for (int i : carrArray) {
            if (i == 0) {
               eastCars ++;
            } else {
                passingcars = passingcars + eastCars;
                if(passingcars > 1000000) {
                    return -1;
                }
            }
        }
        return passingcars;
    }
}
