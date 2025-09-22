class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;

        double avg = 0;
        double sum = 0;

        for(int i = 0; i < k; i++){

            sum = sum + nums[i];

        }

        double maxSum = sum;

        for(int i = k; i < n; i++){

            sum = sum + nums[i] - nums[i-k];
            maxSum = Math.max(sum , maxSum);

        }

        avg = maxSum/k;

        return avg;
        
    }

}
