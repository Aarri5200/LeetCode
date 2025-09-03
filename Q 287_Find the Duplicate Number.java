class Solution {
    public int findDuplicate(int[] nums) {

        int n = nums.length;
        boolean [] x = new boolean[n];

        for(int i = 0; i < n; i++){

            if(x[nums[i]] == true){
                
                return nums[i];

            }

            x[nums[i]] = true;

        }

        return -1;
        
    }

}
