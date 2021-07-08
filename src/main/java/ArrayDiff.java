import java.util.ArrayList;
import java.util.List;

public class ArrayDiff {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {1, 2};
        arrayDiff(a, b);
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> newA = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            newA.add(a[i]);
        }


        List<Integer> newB = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            newB.add(b[i]);
        }

        int lengthA = newA.size();

        for (int j = 0; j < lengthA; j++) {

            if (!(newB.contains(newA.get(j)))) {

                finalList.add(newA.get(j));

            }

        }

        int[] finalArray = new int[finalList.size()];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = finalList.get(i);
        }
        return finalArray;
    }

}
