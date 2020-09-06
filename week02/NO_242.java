package week02;

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) -1);
                if(map.get(c) == 0) map.remove(c);
            } else return false;
        }
        return s.length() == t.length();
    }
}
