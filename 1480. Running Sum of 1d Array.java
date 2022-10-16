class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length-1;
        for(int counter=1;counter<=n;counter++){
            nums[counter]=nums[counter]+nums[counter-1];
        }
        return nums;
    }
}
