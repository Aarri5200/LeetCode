class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int [] arr = new int[n-k+1];

        Deque<Integer> x = new ArrayDeque<>();

        for(int i = 0; i < n; i++){

            if(!x.isEmpty() && x.peekFirst() < i-k+1){

                x.pollFirst();

            }

            while(!x.isEmpty() && nums[x.peekLast()] < nums[i]){

                x.pollLast();

            }

            x.offerLast(i);

            if(i >= k-1){

                arr[i-k+1] = nums[x.peekFirst()];

            }

        }

        return arr;
        
    }
}
