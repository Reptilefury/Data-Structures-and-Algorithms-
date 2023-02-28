package longestConsecutiveSequence;

import java.util.HashSet;

public class longestConsecutive {
    public int longConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for (int num : nums) set.add(num);
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }
                ans = Math.max(count, ans);
            }
        }
        return ans;
    }
}


class LongestConsecutive {
    public int longest(int[] nums) {
        //Check for the size of the integer array
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int ans = 1;
        for (int num : nums) set.add(num);
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }
                ans = Math.max(count, ans);
            }
        }
        return ans;
    }
}

class SolutionConsec {
    public int longest(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int ans = 1;
        for (int num : nums) set.add(num);
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + count)) {
                    num++;
                    count++;
                }
                ans = Math.max(num, count);
            }
        }
        return ans;
    }
}

class  SolutionLongestConsec{
    public  int longest(int[] nums){
        if(nums.length ==0) return  0;
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for(int num:nums) set.add(num);
        for(int num:nums){
            if(!set.contains(num - 1)){
                int count = 1;
                while(set.contains(num - 1)){
                    num++;
                    count++;
                }
                ans = Math.max(num,count);
            }
        }
        return  ans;
    }
}

class  Solution6{
    public int longestConsecutive(int[] nums){
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for(int num:nums) set.add(num);
        for(int num:nums){
            if(!set.contains(num - 1)){
                int count = 1;
                while(set.contains(num + 1)){
                    num++;
                    count++;
                }
                ans = Math.max(count,ans);
            }
        }
        return  ans;
    }
}