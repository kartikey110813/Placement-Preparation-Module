class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        if(s.length() > t.length()) 
            return false;
        
        for(Character ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) +1);
        }
        
         for(Character ch : t.toCharArray()){
            map2.put(ch, map2.getOrDefault(ch,0) +1);
        }
        
        if(map.equals(map2) == true)
            return true;
        return false;
        
    }
}
