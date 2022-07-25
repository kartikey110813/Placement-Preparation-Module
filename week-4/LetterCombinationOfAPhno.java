class Solution {
    
    public String mapping[];
    public List<String> result;
    
    public List<String> letterCombinations(String digits) {
        mapping = new String[10];
        result = new ArrayList<>();
        
        if(digits.length() == 0)
            return result;
        
        mapping[2] = "abc";
        mapping[3] = "def";
        mapping[4] = "ghi";
        mapping[5] = "jkl";
        mapping[6] = "mno";
        mapping[7] = "pqrs";
        mapping[8] = "tuv";
        mapping[9] = "wxyz";
        
        util(digits,0,new StringBuilder());
        return result;
    }
    
    public void util(String digits,int index, StringBuilder sb){
        int n = digits.length();
        if(index == n){
            result.add(sb.toString());
            return;
        }
        
        int val = Character.getNumericValue(digits.charAt(index));
        String combination = mapping[val];
        for(int j=0; j<combination.length(); j++){
            sb.append(combination.charAt(j));
            util(digits,index+1,sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
