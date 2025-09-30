class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        int n = heights.length;

        Integer [] arr = new Integer[n];

        String [] x = new String[n];

        for(int i = 0; i < n; i++){

            arr[i] = i;

        }

        Arrays.sort(arr, (a, b) -> heights[b] - heights[a]);

        for(int i = 0; i < n; i++){

            x[i] = names[arr[i]];

        }

        return x;
        
    }

}
