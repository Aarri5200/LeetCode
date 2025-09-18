class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int count = 0;
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for(int i = 0; i < n1; i++){

             if(x.contains(nums1[i])){
                continue;
            }

            x.add(nums1[i]);

        }

        for(int j = 0; j < n2; j++){

             if(y.contains(nums2[j])){
                continue;
            }

            if(x.contains(nums2[j])){
                y.add(nums2[j]);
            }

        }

         

       int [] arr = y.stream().mapToInt(Integer::intValue).toArray();

       return arr;

    }

}
