import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveInterval {
    public static void main(String[] args) {


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


}


