class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int k = 0;
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){

            if(nums[i] != 0){

                arr[k] = nums[i];

                k++;
                   
            }   

        }

         for(int j = 0; j < n; j++){

            nums[j] = arr[j];

        }
        
    }

}
