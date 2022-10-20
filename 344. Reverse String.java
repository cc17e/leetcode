class Solution {
    public void reverseString(char[] s) {
        char temp;
        for(int counter=0;counter<=(s.length-1)/2;counter++){
            int n=s.length-1-counter;
            temp=s[counter];
            s[counter]=s[n];
            s[n]=temp;
        }
    }
}
