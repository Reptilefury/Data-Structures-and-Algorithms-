package TwoSum;

import java.util.HashMap;

class Solun{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();//value and the index
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (hash.containsKey(diff)) {
                return new int[]{hash.get(diff), i};
            }
            hash.put(num, i); //Add the  value and the index
        }
        return new int[]{};
    }
}

//Recall
class Soln22 {
    public int[] twoSum(int[] nums,int target){
        //Create a hashMap to store the index and the value
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = hash.get(i);
            int difference = target - num;
            if (hash.containsKey(difference)){
                return new int[] {hash.get(difference),i};
            }
            else{
                hash.put(num,i);
            }
        }
        return new int[]{};
    }
}
class Soln2Sum{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer>  hashMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
            int difference = target - num;
            if (hashMap.containsKey(difference)){
                return  new int[] {hashMap.get(difference),i};
            }
            hashMap.put(num,i);
        }
        return new int[] {};
    }
}

class  SolnTwS{
    int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
            int difference = target - num;
            if(hashMap.containsKey(difference)){
                return  new int[] {hashMap.get(difference),i};
            }
            hashMap.put(num,i);
        }
        return  new int[] {};
    }
}
class prince{
    public  int[] endJustifies(int[] nums,int target){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
            int difference = target - num;
            if(hashMap.containsKey(difference)){
                return  new int[] {hashMap.get(difference),i};
            }
            hashMap.put(num,i);
        }
        return  new int[] {};
        }
    }
