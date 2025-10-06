class Solution {
    public int findMaxLength(int[] nums) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i = 0; i < n; i++){

            nums[i] = nums[i] == 0 ? -1 : 1;

        }

        int l = 0; 
        int s = 0;

        for(int i = 0; i < n; i++){

            s = s  + nums[i];

            if(map.containsKey(s)){

                l = Math.max(l, i - map.get(s));

            }

            else{

                map.put(s , i);

            }

        }

        return l;
        
    }

}
