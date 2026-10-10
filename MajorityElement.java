// class Solution {
//     public int majorityElement(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             int count=0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             if(count>nums.length/2){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }
//hashmap
class Solution{
    public int majorityElement(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int value:map.keySet()){ //map.keySet gives all the keys in map
            if(map.get(value)>nums.length/2){ 
                return value;
            }
        }
        return -1;

    }
}
