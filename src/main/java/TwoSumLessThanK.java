import java.util.Arrays;

import static java.lang.Math.max;

public class TwoSumLessThanK {

    public static void main(String[] args) {
        int[] a = new int[]{10, 20, 30};
        System.out.println(twoSumLessThanK(a, 15));
        System.out.println(twoSumLessThanK2(a, 60));
    }

    public static int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);
        int i = 0;
        int j = A.length - 1;
        int maxsum = -1;
        while (i < j) {
            int sum = A[i] + A[j];
            if (sum < K) {
                maxsum = max(maxsum, sum);
                i++;
            } else {
                //sum >= K;
                j--;
            }
        }
        return maxsum;
    }

    static int twoSumLessThanK2(int[] A, int K) {
        int r = -1;
        for (int i = 0; i < A.length; ++i) {
            for (int j = i + 1; j < A.length; ++j) {
                if (A[i] + A[j] < K) {
                    r = max(r, A[i] + A[j]);
                }
            }
        }
        return r;
    }
}
