class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int count = 0;

        for(int i = 1; i < n; i++){

            if(nums[i] != nums[i-1]){

                count++;

            }

        }

        count = count + 1;

        int x = 1;

        for(int j = 1; j < n; j++){

            if(nums[j] != nums[j-1]){

                nums[x] = nums[j];
                x++;

            }

        }

        return count;
        
    }

}
