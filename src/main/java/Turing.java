import java.util.*;

import static java.lang.Math.max;

public class Turing {
    public static void main(String[] args) {
//        int[] a = new int[]{10,20,30};
//        System.out.println(twoSumLessThanK(a,15));
//        System.out.println(twoSumLessThanK2(a,60));

        List<List<Integer>> listList = new ArrayList<>();
        listList.add(new ArrayList<>(List.of(-5, -4)));
        listList.add(new ArrayList<>(List.of(-3, -2)));
        listList.add(new ArrayList<>(List.of(1, 2)));
        listList.add(new ArrayList<>(List.of(3, 5)));
        listList.add(new ArrayList<>(List.of(8, 9)));
        System.out.println(listList);

        int[] toBeRemoved = {-1, 4};
        System.out.println(Arrays.toString(toBeRemoved));
        removeInterval(listList, toBeRemoved);


        List<List<Integer>> listList2 = new ArrayList<>();
        listList2.add(new ArrayList<>(List.of(0, 5)));
        int[] toBeRemoved2 = {2, 3};
        removeInterval(listList2, toBeRemoved2);


        List<List<Integer>> listList3 = new ArrayList<>();
        listList3.add(new ArrayList<>(List.of(0, 2)));
        listList3.add(new ArrayList<>(List.of(3, 4)));
        listList3.add(new ArrayList<>(List.of(5, 7)));
        System.out.println("List 3 :" + listList3);
        int[] toBeRemoved3 = {1, 6};
        System.out.println("To be removed : " + Arrays.toString(toBeRemoved3));
        removeInterval(listList3, toBeRemoved3);




    }

    public static void removeInterval(List<List<Integer>> intervals, int[] toBeRemoved) {
        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < intervals.size(); i++) {

            if (intervals.get(i).get(1) < toBeRemoved[0]) {
                finalList.add(intervals.get(i));
            }
            if ((intervals.get(i).get(1) > toBeRemoved[0]) && !(intervals.get(i).get(0) > toBeRemoved[0])) {
                List<Integer> testList = new ArrayList<>();
                testList.add(intervals.get(i).get(0));
                testList.add(toBeRemoved[0]);
                finalList.add(testList);

            }
            if ((intervals.get(i).get(1) > toBeRemoved[1]) && intervals.get(i).get(0) < toBeRemoved[1]) {
                List<Integer> testList2 = new ArrayList<>();
                testList2.add(toBeRemoved[1]);
                testList2.add(intervals.get(i).get(1));

                finalList.add(testList2);
            }
            if (intervals.get(i).get(0) > toBeRemoved[1]) {
                finalList.add(intervals.get(i));

            }
            if (intervals.get(i).get(0) > toBeRemoved[1] && intervals.get(i).get(1) < toBeRemoved[1]) {
                finalList.add(intervals.get(i));

            }

        }
        System.out.println(finalList);
    }


    public static void addedKey(String s, String t){
        String  value = null;
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0; i < s.length(); i++){
            map.put(s.charAt(i),i);
        }
        for(int i =0; i<t.length(); i++){
            if(!(map.containsKey(t.charAt(i)))){
                value = t.charAt(i)+ "";
            }
        }

    }

    public static  int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);
        int i = 0; int j = A.length - 1;
        int maxsum = -1;
        while(i < j) {
            int sum = A[i] + A[j];
            if(sum < K) {
                maxsum = max(maxsum, sum);
                i++;
            } else {
                //sum >= K;
                j--;
            }
        }
        return maxsum;
    }

    static void Max_Sum(int arr[], int n, int k)
    {
        // To store the break point
        int p = n;

        // Sort the given array
        Arrays.sort(arr);

        // Find the break point
        for (int i = 0; i < n; i++)
        {
            // No need to look beyond i'th index
            if (arr[i] >= k)
            {
                p = i;
                break;
            }
        }

        int maxsum = 0, a = 0, b = 0;

        // Find the required pair
        for (int i = 0; i < p; i++)
        {
            for (int j = i + 1; j < p; j++)
            {
                if (arr[i] + arr[j] < k &&
                        arr[i] + arr[j] > maxsum)
                {
                    maxsum = arr[i] + arr[j];

                    a = arr[i];
                    b = arr[j];
                }
            }
        }

        // Print the required answer
        System.out.print( a + " " + b);
    }

    static int twoSumLessThanK2(int[] A, int K) {
        int r = -1;
        for (int i = 0; i < A.length; ++ i) {
            for (int j = i + 1; j < A.length; ++ j) {
                if (A[i] + A[j] < K) {
                    r = max(r, A[i] + A[j]);
                }
            }
        }
        return r;
    }
}


