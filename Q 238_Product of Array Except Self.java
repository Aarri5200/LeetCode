class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int [] x = new int[n];

        x[0] = 1;

        for(int i = 1; i < n; i++){

            x[i] = x[i-1] * nums[i-1];

        }

        int s = 1;

        for(int  j = (n-1); j >= 0; j--){

            x[j] = x[j] * s;
            s = s * nums[j];

        }

        return x;
        
    }
}
