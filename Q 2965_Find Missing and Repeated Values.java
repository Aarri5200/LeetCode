class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[2];
        int x = grid.length;
        int y = grid[0].length;
        int temp2 = 0;
        int t = 0;
        int m = 0;

         for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                m += grid[i][j];
            }
        }

        for (int a = 0; a < x; a++) {
            for (int b = 0; b < y; b++) {
                int count = 0;
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {
                        if (grid[i][j] == grid[a][b]) {
                            count++;
                        }
                       
                    }
                }
                if (temp2 < count) {
                    temp2 = count;
                    t = grid[a][b];  
                }
            }
        }

        int n = x * y;
        int expectedSum = (n * (n + 1)) / 2;
        int miss = expectedSum - (m - t);  

        arr[0] = t;     
        arr[1] = miss;  
        return arr;
    }
}
