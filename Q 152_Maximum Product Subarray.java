class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;
        int maxProduct = nums[0];

        for(int i = 0; i < n; i++){

            int count = 1;

            for(int j = i; j  < n; j++){

                count = (count*nums[j]);

                maxProduct = Math.max(count, maxProduct);

            }

        }

        return maxProduct;
        
    }

}
