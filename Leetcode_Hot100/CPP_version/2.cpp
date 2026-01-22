#include<iostream>
#include<vector>
#include<unordered_map> // 引入哈希表头文件
#include <algorithm>

using namespace std;

class Solution {
    public:
        vector<vector<string>> groupAnagrams(vector<string>& strs) {
            // 使用unordered_map存储分组，key是排序后的字符串
        unordered_map<string, vector<string>> map;
        
        // 遍历每个字符串
        for (const string& str : strs) {
            // 复制当前字符串并排序
            string sortedStr = str;
            sort(sortedStr.begin(), sortedStr.end());
            
            // 将原始字符串添加到对应的分组中
            map[sortedStr].push_back(str);
        }
        
        // 将map中的所有分组提取到vector中
        vector<vector<string>> result;
        for (const auto& pair : map) {
            result.push_back(pair.second);
        }
        return result;
    }
};