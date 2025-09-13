class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        int n2 = n/2;
        int [] arr = new int[n];

        int [] arr1 = new int[n2];
        int [] arr2 = new int[n2];
        int k = 0;
        int l = 0;

        for(int j = 0; j < n; j++){

             if(nums[j] > 0){

                arr1[k] = nums[j];
                k++;

            }

            if(nums[j] < 0){

                arr2[l] = nums[j];
                l++;

            }

            
        }

        int a = 0;
        int b = 0;

        for(int m = 0; m < n; m++){

            if(m % 2 == 0){

                arr[m] = arr1[a];
                a++;

            }

            else{

                arr[m] = arr2[b];
                b++;
            }


        }

        return arr;
        
    }

}
