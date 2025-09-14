class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        List<Integer> x = new ArrayList<>();
        Map<Integer, Integer> counts = new HashMap<>();

       for(int i=0;i<n;i++){
        int a = nums[i];

        counts.put(a, counts.getOrDefault(a,0) + 1);

       }

       for(Map.Entry<Integer, Integer> entry : counts.entrySet()){

        if(entry.getValue() > n/3){
            x.add(entry.getKey());
        }
       }

        return x;
    }
}
