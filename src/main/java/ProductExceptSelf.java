public class ProductExceptSelf {
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
}
