class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0; i < ransomNote.length(); i++){
            int index = magazine.indexOf(ransomNote.charAt(i));
            if( index == -1)
                return false;
            else
                magazine = magazine.substring(0,index) + magazine.substring(index+1);
        }
        return true;
    }
}
