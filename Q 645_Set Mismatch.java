class Solution {
    public int[] findErrorNums(int[] nums) {

        int n = nums.length;

        int [] arr = new int[2];

        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){

            if(set.contains(i)){

                arr[0] = i;

                continue;

            }

            set.add(i);

        }

        int count1 = 0;
        int count2 = 0;
        int j = 1;

        for(int i : set){

            count1 = count1 + i;
            count2 = count2 + j;
            j++;

        }

        count2 = count2 + j;

        arr[1] = count2 - count1;

        return arr;
  
    }

}

