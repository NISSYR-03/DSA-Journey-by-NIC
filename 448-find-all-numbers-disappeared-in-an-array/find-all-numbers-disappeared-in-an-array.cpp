class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {

        unordered_set<int> seen;
        vector<int> answer;

        // Store all numbers present
        for (int i = 0; i < nums.size(); i++) {
            seen.insert(nums[i]);
        }

        // Check numbers from 1 to n
        for (int i = 1; i <= nums.size(); i++) {
            
            if (seen.count(i) == 0) {
                answer.push_back(i);
            }
        }

        return answer;
    }
};