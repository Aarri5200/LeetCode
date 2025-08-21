class Solution {
    public double myPow(double x, int n) {
        
        long N = n;

        if(n<0){
            x = 1/x;
            N = -N;
        }

        double result = Math.pow(x,N);

        

        return result;

    }
}
