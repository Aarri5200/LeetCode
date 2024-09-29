class Solution {
    public void sortColors(int[] nums) {
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count1++;
            }
            else if(nums[i]==1){
                count2++;
            }
            else{
                count3++;
            }
        }
        for(int j=0;j<count1;j++){
             nums[j]=0;
        }
        for(int x = count1;x<count1+count2;x++){
            nums[x]=1;
        }
        for(int y=count1+count2;y<count1+count2+count3;y++){
             nums[y]=2;
        }
    }
}
