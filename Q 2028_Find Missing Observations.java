class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {

        int l = rolls.length;
        int sum = 0;

        for(int i = 0; i < l; i++){

            sum = sum + rolls[i];

        }

        int out = ((n+l) * mean) - sum;

        if(out < n || out > (n*6)){

            return new int[0];
            
        }

        int [] arr = new int[n];

        int x = out / n;
        int y = out % n;

        for(int i = 0; i < n; i++){

            arr[i] = x + (i < y ? 1 : 0);

        }

        return arr;
        
    }

}
