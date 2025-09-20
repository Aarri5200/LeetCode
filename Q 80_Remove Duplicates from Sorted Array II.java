class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        ArrayList<Integer> x = new ArrayList<>();
        
        for(int i = 0; i < n; i++){

            int count = 0;

            for(int j = i; j < n; j++){

                if(nums[j] == nums[i]){

                    count++;

                }

            }

            if(count <= 2){

                x.add(nums[i]);

            }

        }

        int [] arr = new int[x.size()];

        int l = arr.length;

        for(int i = 0; i < l; i++){

            arr[i] = x.get(i);
            nums[i] = x.get(i);


        }

        return l;
    
    }

}
