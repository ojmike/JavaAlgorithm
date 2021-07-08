import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HourglassSum {
    public static void main(String[] args) {
        List<List<Integer>> listList = new ArrayList<>();
        listList.add(new ArrayList<>(List.of(-9, -9, -9, 1, 1, 1)));
        listList.add(new ArrayList<>(List.of(0, -9, 0, 4, 3, 2)));
        listList.add(new ArrayList<>(List.of(-9, -9, -9, 1, 2, 3)));
        listList.add(new ArrayList<>(List.of(0, 0, 8, 6, 6, 0)));
        listList.add(new ArrayList<>(List.of(0, 0, 0, -2, 0, 0)));
        listList.add(new ArrayList<>(List.of(0, 0, 1, 2, 4, 0)));

        hourglassSum(listList);
    }
    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        List<Integer> listOfHourGlass = new ArrayList<>();

    // Write your code here
        int count = 0;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int sum =0;
                    sum += arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                    sum += arr.get(i + 1).get(j + 1);
                    sum += arr.get(i + 2).get(j) +arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                    listOfHourGlass.add(sum);
                }


        }
            Collections.sort(listOfHourGlass);

        return listOfHourGlass.get(listOfHourGlass.size()-1);
    }

}