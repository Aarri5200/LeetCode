class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int sum = 0;

        int[] modFreq = new int[k];
        modFreq[0] = 1; 

        for (int num : nums) {
            sum += num;

            int mod = ((sum % k) + k) % k;

            count += modFreq[mod];
            modFreq[mod]++;
        }

        return count;
    }
}
