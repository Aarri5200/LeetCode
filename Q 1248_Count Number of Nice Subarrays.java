class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int n = nums.length;

        if(k < 0){

            return 0;

        }

        int [] arr = new int[n];

        for(int i = 0; i < n; i++){

            if(nums[i] % 2 == 0){

                arr[i] = 0;

            }

            else{

                arr[i] = 1;

            }

        }

        int l1 = 0;
        int r1 = 0;
        int sum1 = 0;
        int count1 = 0;

        while(r1 < n){

            sum1 = sum1 + arr[r1];

            while(sum1  > k){

                sum1 = sum1 - arr[l1];
                l1 = l1 + 1;

            }

            r1 = r1 + 1;

            count1 = count1 + (r1 - l1 + 1);

        }

          int l2 = 0;
        int r2 = 0;
        int sum2 = 0;
        int count2 = 0;

        while(r2 < n){

            sum2 = sum2 + arr[r2];

            while(sum2  > (k - 1)){

                sum2 = sum2 - arr[l2];
                l2 = l2 + 1;

            }

            r2 = r2 + 1;

            count2 = count2 + (r2 - l2 + 1);

        }

        return (count1 - count2);
        
    }

}
