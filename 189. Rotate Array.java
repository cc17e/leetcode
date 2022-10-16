class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] a=new int[nums.length];
        for(int counter=0;counter<nums.length;counter++){
            a[counter]=nums[counter];
        }

        for(int counter=0;counter<nums.length-k;counter++){
            nums[counter+k]=a[counter];
        }
        int n=k;
        for(int counter=0;counter<=k-1;counter++){
            nums[counter]=a[nums.length-n];
            n--;
        }
    }
}
