package classesMain.DeutcheBank;

public class MissingNumberInAnSymmetricalArray {
/*
Remember the difference
Problem 1: Missing Number ✅
Input:
1 2 4 5
Output:
3
Algorithm:
XOR(1...N) ^ XOR(array)
Problem 2: Odd Occurrence / Single Number ✅
Input:
4 1 2 1 2
Output:
4
Algorithm:
XOR(all array elements)
This distinction is a very common interview question.
Interviewers often expect you to recognize which XOR
pattern fits the problem based on the input.
* */
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(findMissingNumber(arr));
    }

    private static int findMissingNumber(int[] arr) {
        int xor = 0;
        for(int i :arr) {
            xor ^=i;
        }
        return xor;
    }
}
