package productOfArray;
public class prodArrayExceptSelf {
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


class ProdArryExceptSelfSol{
    public  int[] prodArrayExceptSelf(int[] nums){
        int[] arr = new int[nums.length];
        int right=1; int left =1;
        for(int i=0;i<nums.length;i++){
            arr[i] = left;
            left *= nums[i];
        }
        for(int i = nums.length -1;i>=0;i--){
            arr[i] *= right;
            right *= nums[i];
        }
        return  arr;
    }
}
class ProductArrayExceptSelf{
    public  int[] prodArray(int[] nums){
        int[] arr = new int[nums.length];
        int left=1; int right=1;
        for(int i = 0;i<nums.length;i++){
            arr[i] = left;
            left *= nums[i];
        }
        for(int i =nums.length -1;i >=0;i--){
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }
}

class Soln{
    public  int[] productExceptSelf(int[] nums){
        int[] array = new int[nums.length];
        int right =1, left =1;
        for(int i = 0; i < nums.length; i++){
            array[i] = left;
            left *= nums[i];
        }
        for(int i = nums.length -1; i >=0;i--){
            array[i] *= right;
            right *= nums[i];
        }
        return array;
     }
     public int[] productArrayExceptSelfNumsPrefix(int[] nums){
        int[] output = new int[nums.length];
        output[0] = 1;

        for(int i =0;i<nums.length -1;i++) output[i + 1] = output[i] * nums[i];
        for(int i = nums.length -2; i >= 0;i++){
            output[i] = nums[i + 1] * output[i];
            nums[i] = nums[i] * nums[i + 1];
        }
        return output;
    }
}






















