class Solution {
    public int longestPalindrome(String s) {
        int[] count=new int[256];
        int totals=0,t=0;
        for(int counter=0;counter<s.length();counter++){
            count[s.charAt(counter)]++;
        }

        for(int counter=0;counter<256;counter++){
            totals+=count[counter]/2;
        }

        if(s.length()!=totals*2)return totals*2+1;
        else return totals*2;
    }
}
