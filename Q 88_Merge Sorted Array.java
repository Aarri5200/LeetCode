class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int [] temp = new int[m+n];
        int temp1 = 0;

        for(int i = 0;i<m;i++){
            if(nums1[i]!= 0){
                temp[i] = nums1[i];
            }
        }

        for(int j=m, i=0; i<n; j++,i++){
            temp[j] = nums2[i];
        }

        for(int i=0; i<((m+n)-1); i++){
            for(int j=(i+1); j<(m+n); j++){
                   if(temp[j]<temp[i]){
                    temp1 = temp[i];
                    temp[i] = temp[j];
                    temp[j] = temp1;
                   }
            }
        }

        for(int i=0; i<(m+n); i++){
            nums1[i] = temp[i];
        }

    }
}
