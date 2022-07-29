class Solution {
    public String convertToTitle(int columnNumber) {
        int temp = columnNumber;
        
        StringBuilder sb = new StringBuilder();
        
        while(temp > 0) {
            int rem = temp % 26;
            
            if(rem == 0) {
                sb.append('Z');
                temp = temp/26 -1;
            }
            else{
                char  c = (char)('A' + rem-1);
                sb.append(c);
                temp = temp/26;
            }
        }
        return sb.reverse().toString();
    }
}
