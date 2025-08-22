class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int largest = nums[0];
        int n = nums.length;

        for(int i=0; i<n; i++){
           
           sum = sum+nums[i];
           largest = sum>largest?sum:largest;
           
           if(sum<0){
             sum = 0;
           }
        }
        return largest;
    }
}
