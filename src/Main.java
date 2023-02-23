import java.util.HashSet;
import java.util.Set;
/*
* public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
* */
class Soln {
    public static boolean containsDuplicate(int[] nums) {
        //hashset
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                return true;
            }
            hashSet.add(nums[i]);
        }
        return false;
    }
}



















