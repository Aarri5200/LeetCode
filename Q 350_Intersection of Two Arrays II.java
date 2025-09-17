class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        List<Integer> x = new ArrayList<>();

        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if(nums2[j] == nums1[i]){
                    x.add(nums2[j]);
                    nums2[j] = Integer.MIN_VALUE;
                    break; 
                }
            }
        }

        int[] result = new int[x.size()];
        for (int i = 0; i < x.size(); i++) {
            result[i] = x.get(i);
        }

        return result;
    }
}
