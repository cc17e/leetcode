class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] record=new int[2];
        int start=0,end=numbers.length-1,mid=0;

        for(int n=0;n<numbers.length-1;n++){
            int search=target-numbers[n];
            start=n+1;
            while(start<=end){
                mid=(start+end)/2;
                if(search==numbers[mid]){
                    record[0]=n+1;
                    record[1]=mid+1;
                    return record;
                }
                if(numbers[mid]<=search){
                    start=mid+1;
                }
                else
                    end=mid-1;
            }
        }
        return record;
    }
}
