package productOfArray;


public class ProdArrayExceptSelf{
    public  int[] prodExceptSelf(int[] nums){
        int[] arr = new int[nums.length];
        int right = 1; int left = 1;
        for (int i = 0;i< nums.length;i++){
            arr[i] = left;
            left *= nums[i];
        }
        for(int i = nums.length -1; i >= 0;i--){
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }
}



