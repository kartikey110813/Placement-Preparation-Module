class Solution {
    public void nextPermutation(int[] arr) {
        int i = arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1])
            i--;
        if(i>=0){  
            int j = arr.length-1;
            while(arr[i]>=arr[j])
            j--; 
            swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length-1);
    }
    
    public void reverse(int[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
