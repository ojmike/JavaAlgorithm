import java.util.ArrayList;
import java.util.List;

public class RectangleBoxes {

    public static boolean[] rectangleBoxes(int[][] operations){
        List<Integer> areaList = new ArrayList<>();
        List<Integer> bigAreaList = new ArrayList<>();
        List<Boolean> finalResult = new ArrayList<>();

        int sumArea =0;
        for (int[] operation : operations) {
            if (operation[0] == 0) {
                int area = operation[1] * operation[2];
                areaList.add(area);
            }
            if (operation[0] == 1) {
                int bigArea = operation[1] * operation[2];
                bigAreaList.add(bigArea);
            }
        }
        for (Integer integer : areaList) {
            sumArea += integer;
        }
        for (Integer integer : bigAreaList) {
            if (sumArea < integer) {
                finalResult.add(true);
            } else {
                finalResult.add(false);
            }
        }
        boolean[] finalBoolean = new boolean[finalResult.size()];
        for(int i=0; i<finalResult.size();i++){
            finalBoolean[i]= finalResult.get(i);
        }
        return finalBoolean;
    }
}
