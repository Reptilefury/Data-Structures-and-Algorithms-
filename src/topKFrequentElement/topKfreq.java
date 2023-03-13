package topKFrequentElement;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
public class topKfreq{
    public int[] topKfrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0));
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            pq.add(it);
            if (pq.size() > k) {
                pq.poll();
            }
            int i = k;
            while (!pq.isEmpty()) {
                arr[--i] = pq.poll().getKey();
            }
        }
        return arr;
    }
}

class Solution1 {
    public int[] topKfreq(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            pq.add(it);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int i = k;
        while (!pq.isEmpty()) {
            arr[--i] = pq.poll().getKey();
        }
        return arr;
    }
}

class Soluon2 {
    public int[] topKfreq(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            pq.add(it);
            if (pq.size() > k) pq.poll();
        }
        int i = k;
        while (!pq.isEmpty()) {
            arr[--i] = pq.poll().getKey();
        }
        return arr;
    }
}


class TopKfreq {
    public int[] topKfreq(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer,Integer> it:hashMap.entrySet()){
            pq.add(it);
            if(pq.size()>k) pq.poll();
        }
        int i =k;
        while(!pq.isEmpty()){
            res[--i] = pq.poll().getKey();
        }
        return  res;
    }
}

class TopKfreqElement{
    public int[] topKfreq(int[] nums,int k){
        int[] arr = new int[k];
        HashMap<Integer,Integer> hashMap = new  HashMap<>();
        for(int num:nums) hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new  PriorityQueue<>(
                (a,b) -> a.getValue() - b.getValue()
        );
        for (Map.Entry<Integer,Integer> it:hashMap.entrySet()){
            pq.add(it);
            if(pq.size()>k) pq.poll();
        }
        int i = k;
        while(!pq.isEmpty()){
            arr[--i] = pq.poll().getKey();
        }
        return  arr;
    }
}
class TopKfreqElementQ{
    public  int[] topKfreq(int[] nums, int k){
        int[] arr = new int[k];
        HashMap<Integer,Integer>  map = new  HashMap<>();
        for(int num:nums) map.put(num, map.getOrDefault(num,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
                (a,b) -> a.getValue() -b.getValue()
        );
        for (Map.Entry<Integer,Integer> it:map.entrySet()){
            pq.add(it);
            if(pq.size() > k) pq.poll();
        }
        int i = k;
        while(!pq.isEmpty()){
            arr[--i] = pq.poll().getKey();
        }
        return  arr;
    }
}

class TopKFreqElement{
    public int[] topKfreq(int[] nums,int k){
        int[] arr = new int[k];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num:nums) hashMap.put(num,hashMap.getOrDefault(num,0));
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
                (a,b) -> a.getValue() - b.getValue()
        );
        for(Map.Entry<Integer,Integer> it: hashMap.entrySet()){
            pq.add(it);
            if(pq.size() >k) pq.poll();
        }
        int  i = k;
        while (!pq.isEmpty()){
            arr[--i] = pq.poll().getKey();
        }
        return  arr;
     }
}

class TopKfreqJavA{
    public  int[] topKfreq(int[] nums,int k){
        int[] arr = new int[k];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num:nums) hashMap.put(num,hashMap.getOrDefault(num,0));
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
                (a,b) -> a.getValue() - b.getValue()
        );
        for (Map.Entry<Integer,Integer> it:hashMap.entrySet()){
            pq.add(it);
            if (pq.size() > k) pq.poll();
        }
        int i = k;
        while (!pq.isEmpty()){
            arr[--i] = pq.poll().getKey();
        }
        return arr;
    }
}
class Solution1TK{
    public  int[] topKfreq(int[] nums,int k){
        int[] arr = new int[k];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num:nums) hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> pq =  new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer,Integer> it:hashMap.entrySet()){
            pq.add(it);
            int i = k;
            if(!pq.isEmpty()){
                arr[--i] = pq.poll().getKey();
            }
        }
        return arr;
    }
}