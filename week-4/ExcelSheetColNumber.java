class Solution {
    public int titleToNumber(String columnTitle) {
        int power =0;
        int value = 0;
        int finalAns = 0;
        
        for(int i=columnTitle.length()-1; i>=0; i--) {
                int faceValue = columnTitle.charAt(i) - 'A' + 1;
                int powerValue = (int) Math.pow(26,power);
            value = faceValue * powerValue;
                finalAns+= value;
                power++;
        }
        
        return finalAns;
    }
}
