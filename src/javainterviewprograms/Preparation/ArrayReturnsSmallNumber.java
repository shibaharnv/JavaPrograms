package javainterviewprograms.Preparation;

public class ArrayReturnsSmallNumber {

    public static void main(String[] args) {

        //int[] a={-1, 1, -2, 2};

        int[] a={1,5,6,8};

        int result=solution(a);
        System.out.println(result);
    }

    static  int solution(int[] A) {
        int ans = A[0];
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }
}
