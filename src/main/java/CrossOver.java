import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrossOver {
    public static void main(String[] args) {
int[][] operations = new int [][]{{0,1,3},{0,4,2},{1,3,4},{1,3,2}};
int[] nums = new int[]{1,2,3,4,5,6,7};
int k = 3;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(rotate(nums,k)));
//        System.out.println(Arrays.toString(rectangleBoxes(operations)));
    }


    public static int almostSubstring(String t, String s){
        int count =0;
        for(int i =0; i < t.length()-4; i++){
            String construct = String.valueOf(t.charAt(i)+"" + t.charAt(i+2)+""+t.charAt(i+4));
            if(construct.equals(s)){
                count++;
            }
        }
        return  count;
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        int[] right = new int[nums.length];
        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = left[i] * right[i];
        }
        return nums;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0, temp=1; i<nums.length; res[i] = temp, temp *= nums[i++]) ;
        for(int i=nums.length-1, temp=1; i>=0; res[i] *= temp, temp *= nums[i--]) ;
        return res;
    }

    public static boolean pref(String[] a, String[] b){
        List<String> str = new ArrayList();
        String initStr = "";
        for (String data: a) {
            initStr += data;
            str.add(initStr);
        }
        for (String ch: b) {
            if(!str.contains(ch)) return false;
        }
        return  true;
    }

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
