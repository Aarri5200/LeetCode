class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int reminder=0;
        int answer=0;
         if(x < 0){
            return false;
         }
         else{ while(temp>0){
            reminder=temp%10;
            answer=answer*10+reminder;
            temp=temp/10;
        }}
       
        return x==answer;
    }
}
