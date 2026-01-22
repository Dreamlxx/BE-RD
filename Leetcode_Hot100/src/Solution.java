import java.util.*;

class Solution{
    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key=target-nums[i];
            if(map.containsKey(key)) {
                return new int[]{map.get(key),i};
            }
            map.put(nums[i],i);//数组里的值当作键
        }
        return new int[]{-1,-1};
    }



    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();

        //遍历字符串变成字符并且将每个字符进行排序
        for (String str : strs) {
            //将字符串转换为数组
            char[]charArray=str.toCharArray();
            Arrays.sort(charArray);

            //将排序后的char数组重新化成String字符串.
            String sortedStr = new String(charArray);/*需要使用new，
            如果用charArray.toString则会输出的是[C@...的形式*/

            //如果这个排序后的字符串不在哈希表(键)中，则生成一个新的列表
            //使用computeIfAbsent简化代码，避免null检查
            List<String>list=map.computeIfAbsent(sortedStr,k->new ArrayList<>());
            //computeIdAbsent:如果不存在则计算。

            list.add(str);
        }
        return new ArrayList<>(map.values());
    }
}