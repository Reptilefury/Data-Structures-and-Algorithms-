package ContainsDuplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicateJv {
    //Create an empty hashSet to add items to
    //Hashmaps take distinct values and cannot take duplicate elements
    public static boolean containsDupe(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                return true;
            } else {
                hashSet.add(nums[i]);
            }
        }
        return false;
    }
}
class SolutionDuplicate{
    public boolean containsDuplicate(int[] nums){
        //HashSet to store distinct elements
        Set<Integer> hashSet = new HashSet<>();
        for(int num:nums){
            if(hashSet.contains(nums[num])){
                return true;
            }else {
                hashSet.add(nums[num]);
            }
        }
        return  false;
    }
}

class ContainsDuplicat22{
    public boolean containsDuplicate(int[] nums){
        Set<Integer> hashSet = new HashSet<>();
        for(int i =0; i < nums.length;i++){
            if(hashSet.contains(nums[i])){
                return true;
            }else{
                hashSet.add(nums[i]);
            }
        }
        return false;
     }
}