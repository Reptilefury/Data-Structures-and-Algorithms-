package TwoSum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solun {
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
    public int[] twoSum(int[] nums, int target) {
        //Create a hashMap to store the index and the value
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = hash.get(i);
            int difference = target - num;
            if (hash.containsKey(difference)) {
                return new int[]{hash.get(difference), i};
            } else {
                hash.put(num, i);
            }
        }
        return new int[]{};
    }
}

class Soln2Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int difference = target - num;
            if (hashMap.containsKey(difference)) {
                return new int[]{hashMap.get(difference), i};
            }
            hashMap.put(num, i);
        }
        return new int[]{};
    }
}

class SolnTwS {
    int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int difference = target - num;
            if (hashMap.containsKey(difference)) {
                return new int[]{hashMap.get(difference), i};
            }
            hashMap.put(num, i);
        }
        return new int[]{};
    }
}

class prince {
    public int[] endJustifies(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int difference = target - num;
            if (hashMap.containsKey(difference)) {
                return new int[]{hashMap.get(difference), i};
            }
            hashMap.put(num, i);
        }
        return new int[]{};
    }
}

class Solution {
    public List<List<String>> groupAnagram(String[] strs) {
        List<List<String>> arr = new ArrayList<>();
        if (strs.length == 0) return arr;
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String string : strs) {
            int[] hash = new int[26];
            for (char c : string.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = new String(Arrays.toString(hash));
            hashMap.computeIfAbsent(key, k -> new ArrayList<>());
            hashMap.get(key).add(string);
        }
        arr.addAll(hashMap.values());
        return arr;
    }
}

class  SolnTwoSum{
    public  int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
             int diff = target - num;
             if(map.containsKey(diff)){
                 return new  int[] {map.get(diff), i };
             }
             map.put(num,i);
        }
        return new int[] {};
    }
}


class  last{
    public int[] twoS(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i< nums.length;i++){
            int num = nums[i];
            int diff = target - num;
            if(map.containsKey(diff)){
                return new int[] {map.get(diff),i};
            }
            map.put(num,i);
        }
        return new int[] {};
    }
}











