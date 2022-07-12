class Solution {

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        int increment = (numRows - 1) * 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length();) {
                if (i == 0 || i == numRows - 1) {
                    sb.append(s.charAt(j));
                } else {
                    sb.append(s.charAt(j));
                    int temp_increment = increment - 2 * i;
                    if(j+temp_increment<s.length())
                    sb.append(s.charAt(j + temp_increment));
                }
                j = j + increment;
            }
        }
        return sb.toString();
    }
}
