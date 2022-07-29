class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> a = new ArrayList<>();
        
        for(int i = 0; i<=rowIndex; i++) {
            long res = 1;
            for(int j=0; j<i; j++) {
                res *= (rowIndex-j);
                res/= (j+1);
            }
            a.add((int)res);
        }
        return a;
    }
}
