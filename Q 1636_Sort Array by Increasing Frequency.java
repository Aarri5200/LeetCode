class Solution {
    public int[] frequencySort(int[] nums) {
       
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

    
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA != freqB) {
                return freqA - freqB;
            } else {
                return b - a; 
            }
        });

        // Convert back to int array
        return Arrays.stream(arr).mapToInt(i -> i).toArray();
    }
}
