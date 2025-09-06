class Solution {
    public int reversePairs(int[] nums) {

        int n = nums.length;

        return merge(nums, 0, n-1);
        
    }

    private int merge(int [] arr, int l, int r){

        if(l >= r){

            return 0;

        }

        int m = (l+r) / 2;
        
        int count = merge(arr, l, m) + merge(arr, m+1, r);

        int j = m+1;

        for(int i = l; i <= m; i++){

            while(j <= r && (long)arr[i] > 2L * arr[j]){

                j++;

            }

            count  = count + j - (m+1);

        }

        Arrays.sort(arr, l, r+1);

        return count;

    }
}
