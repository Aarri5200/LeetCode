#include <vector>
using std::vector;

class Solution {
public:
    vector<int> findIntersectionValues(vector<int>& nums1, vector<int>& nums2) {

        int existenceNums1[101]{}; 
        int existenceNums2[101]{}; 

        for (int num : nums1) {
            existenceNums1[num] = 1;
        }

        for (int num : nums2) {
            existenceNums2[num] = 1;
        }

        vector<int> intersectionCount(2);


        for (int num : nums1) {
            intersectionCount[0] += existenceNums2[num]; 
        }

        for (int num : nums2) {
            intersectionCount[1] += existenceNums1[num]; 
        }

        return intersectionCount;
    }
};
