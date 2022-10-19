class Solution {
    public void moveZeroes(int[] nums) {
        int temp,i=0;
        for(int n=0;n<=nums.length-2-i;n++){
            if(n!=-1&&nums[n]==0){
                for(int counter=n;counter<=nums.length-2-i;counter++){
                    temp=nums[counter];
                    nums[counter]=nums[counter+1];
                    nums[counter+1]=temp;
                }
                n=n-1;
                i++;
            }
        }
    }
}
