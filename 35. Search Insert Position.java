class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid=0,head=0,end=nums.length;
        while(end>head){
            mid=(head+end)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]<target){
                mid++;
                head=mid;
            }
            else
                end=mid;
        }
        return mid;        
    }
}
