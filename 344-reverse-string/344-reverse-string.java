class Solution {
    // reverse string uses 2 pointers; one at each end of the string
    public void reverseString(char[] s){
        int start = 0 , end = s.length -1;
        sol(s,start,end);
    }
    public void sol(char[] a,int i,int j){
        if(i >= j) return;
        swap(a,i,j);
        sol(a,++i,--j);
    }
    
   /* public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while(i<j){
            swap(s,i,j);
            i++;
            j--;
        }
    } */
    // swap is a helper method to swap characters
    public void swap(char[] a,int i,int j){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}