package GroupAnagrams;
import javax.swing.plaf.ListUI;
import java.util.*;

public class grouAnagrams {
    public List<List<String>> grpAnagrams(String[] str) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        if (str.length == 0) {
            return res;
        }
        for (String s : str) {
            char[] hash = new char[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = new String(hash);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) {
            return res;
        }


        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String s : strs) {
            char[] hash = new char[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = new String(hash);
            hashMap.computeIfAbsent(key, k -> new ArrayList<>());
            hashMap.get(key).add(s);
        }
        res.addAll(hashMap.values());
        return res;
    }
}


class SolutionAnagram {
    List<List<String>> groupAnagram(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;
        HashMap<String, List<String>> map = new HashMap<>();
        for (String string : strs) {
            char[] hash = new char[26];
            for(char c:string.toCharArray()){
                hash[c - 'a']++;
            }
            String key  = new String(hash);
            map.computeIfAbsent(key,k -> new ArrayList<>());
            map.get(key).add(string);
        }
        res.addAll(map.values());
        return  res;
    }
}



class Soltn2{
    List<List<String>> groupAnagram(String[] strs){
        List<List<String>> res = new ArrayList<>();
        if(strs.length == 0) return  res;
        HashMap<String,List<String>> hashMap = new HashMap<>();
        for(String string:strs){
            char[] hash = new char[26];
            for(char c:string.toCharArray()){
                hash[c - 'a']++;
            }
            String key = new String(hash);
            hashMap.computeIfAbsent(key,k -> new ArrayList<>());
            hashMap.get(key).add(string);
        }
        res.addAll(hashMap.values());
        return res;
    }
}



class GroupAnagrams{
    public List<List<String>> groupAnagram(String[] strs){
        List<List<String>> arr = new  ArrayList<>();
        if(strs.length ==0) return arr;
        HashMap<String,List<String>> hashMap = new HashMap<>();
        for(String s:strs){
            int[] hash = new int[26];
            for (char c:s.toCharArray()){
                hash[c - 'a']++;
            }
            String key = new String(Arrays.toString(hash));
            hashMap.computeIfAbsent(key,k -> new ArrayList<>());
            hashMap.get(key).add(s);
        }
        arr.addAll(hashMap.values());
        return arr;
    }
}

class SolutionGroup1{
    public List<List<String>> solGroup(String[] strs){
        List<List<String>> res = new ArrayList<>();
        if(strs.length == 0) return res;
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            int[] hash = new int[26];
            for(char c:s.toCharArray()){
                hash[c - 'a']++;
            }
            String key = new String(Arrays.toString(hash));
            map.computeIfAbsent(key,k-> new ArrayList<>());
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return  res;
    }
}

class  SolnGrp{
    public  List<List<String>> groupAnagram(String[] strs){
        List<List<String>> res = new ArrayList<>();
        if(strs.length == 0) return  res;
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            int[] hash =  new int[26];
            for(char c:s.toCharArray()){
                hash[c - 'a']++;
            }
            String key = new String(Arrays.toString(hash));
            map.computeIfAbsent(key,k-> new ArrayList<>());
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}