class NumArray {
public:
    vector<int>nar;
    NumArray(vector<int>& nums) {
        nar = nums;
        for(int i = 1;i<nums.size();i++)
            nar[i] = nar[i]+nar[i-1];
    }
    
    int sumRange(int left, int right) {
        if(left==0){
            return nar[right];
        }
       return nar[right] - nar[left-1]; 
    }
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * int param_1 = obj->sumRange(left,right);
 */
