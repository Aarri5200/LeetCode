class Solution {
    public int hIndex(int[] citations) {

        int n = citations.length;
        int out = 0;

        Arrays.sort(citations);

        for(int i = 0; i < n; i++){

            int number = n-i;

            if(citations[i] >= number){

                out = number;
                break;

            }

        }

        return out;
        
    }

}
