class Solution {
    public int pivotIndex(int[] nums) {
        int p=nums.length-1,totals=0,another=0; //陣列為0~n
        
        for(int c=1;c<=p;c++){
            totals+=nums[c];
        }
        if(totals==0)return 0;
    
        totals=0;
        for(int c=1;c<=p-1;c++){
            for(int counter=c-1;counter>=0;counter--){
                totals+=nums[counter];
            }
            for(int counter=c+1;counter<=p;counter++){
                another+=nums[counter];
            }
            if(totals==another)return c;
            totals=0;
            another=0;
        }
        totals=0;
        
        for(int c=0;c<=p-1;c++){
            totals+=nums[c];
        }
        if(totals==0)return p; 
    return -1;
    }
}
