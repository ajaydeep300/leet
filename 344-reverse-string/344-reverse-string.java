class Solution {
    // reverse string uses 2 pointers; one at each end of the string
    public void reverseString(char[] s){
        int end = s.length-1;
        int start = 0;
        recur(s,start,end);
    }
    public void swap(char[] a , int i , int j){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
    public void recur(char[] x, int y, int z){
        if(y >= z){
            return;
        }
        else{
            swap(x,y,z);
            y += 1;
            z -= 1;
            recur(x,y,z);
        }
    }
}