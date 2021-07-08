import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rotate {

    public static void main(String[] args) {
        int[][] operations = new int [][]{{0,1,3},{0,4,2},{1,3,4},{1,3,2}};
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(rotate(nums,k)));
    }



    public static int[] rotate(int[] nums, int k){
        List<Integer> newList = new ArrayList<>();
        for(int i =nums.length-k; i < nums.length; i++){
            newList.add(nums[i]);
        }
        for(int i=0; i < nums.length-k; i++){
            newList.add(nums[i]);
        }
        return  newList.stream().mapToInt(i->i).toArray();
    }
}
