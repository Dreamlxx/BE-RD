#include <iostream>
#include <vector>
#include <unordered_map>// 引入哈希表头文件

using namespace std;

class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::unordered_map<int, int> hashMap;  // 存储<数值, 索引>
        
        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums[i];
            
            // 检查补数是否已经在哈希表中
            if (hashMap.find(complement) != hashMap.end()) {
                // 返回两个索引
                return std::vector<int>{hashMap[complement], i};
            }
            
            // 将当前数值和索引存入哈希表
            hashMap[nums[i]] = i;
        }
        
        // 题目保证有解，但为了完整性返回空向量
        return std::vector<int>{};
    }
};
