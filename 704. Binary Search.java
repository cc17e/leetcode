class Solution {
    public int search(int[] nums, int target) {
        int head=0,mid=1,end=nums.length-1;        
        while(head<=end){
            mid=(head+end)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target)head=++mid;
            else end=mid-1;
        }
        return -1;
    }
}
