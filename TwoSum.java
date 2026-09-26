/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
*/
class Solution{
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int currentNum=nums[i];
            int neededNum=target-currentNum;
            if(map.containsKey(neededNum)){
                return new int[]{map.get(neededNum),i};
            }
            map.put(currentNum,i);

        }
        return new int[]{};
    }
}
