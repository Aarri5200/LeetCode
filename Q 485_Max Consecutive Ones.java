class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length;
        int maxCount = 0;
        int count = 0;

        for(int i = 0; i < n; i++){ 

            if(nums[i] == 1){
                count++;
            }
            else if(nums[i] == 0){

                count  = 0;
            }

        maxCount = Math.max(count, maxCount);

        }

        return maxCount;
        
    }
}
