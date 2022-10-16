class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;  
        int temp = 0;  
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(nums[j-1] > nums[j]){   
                    temp = nums[j-1];  
                    nums[j-1] = nums[j];  
                    nums[j] = temp;  
                }                           
            }  
        }
        return nums; 
    }
}
