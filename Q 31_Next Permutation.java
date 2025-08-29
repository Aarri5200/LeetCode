class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int x = 0;

        for(int i = (n-1); i >= 1; i--){

            if(nums[i-1] < nums[i]){

                x = (i-1);
                break;
    
            }

            else{

                x = -1;

            }

        }

        if(x == -1){

            int left = 0;
            int right = n-1;

            while(left < right){

                int temp = 0;
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;

            }

            return;

        }

        for(int i = (n-1); i >= x; i--){

            if(nums[i] > nums[x]){

                int t = 0;
                t = nums[x];
                nums[x] = nums[i];
                nums[i] = t;

                break;
                
            }

        }

        int l = (x+1);
        int r = (n-1);

        while(l < r){

            int t1 = 0;
            t1 = nums[l];
            nums[l] = nums[r];
            nums[r] = t1;

            l++;
            r--;

        }
        
    }
}
