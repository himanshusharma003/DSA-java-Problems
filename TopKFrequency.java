class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] unique=new int[nums.length];
        int[] frequency=new int[nums.length];
        int uniquecount=0;
        
        for(int i=0;i<nums.length;i++){
            int index=-1;
            for(int j=0;j<uniquecount;j++){
                if(unique[j]==nums[i]){
                    index=j;
                    break;
                }
            }
            if(index==-1){
                unique[uniquecount]=nums[i];
                frequency[uniquecount]=1;
                uniquecount++;
            }else{
                frequency[index]++;
            }
        }
        int[] answer=new int[k];
        for(int i=0;i<k;i++){
            int maxIndex=0;
            for(int j=1;j<uniquecount;j++){
                if(frequency[j]>frequency[maxIndex]){
                    maxIndex=j;
                }
            }
            answer[i]=unique[maxIndex];
            frequency[maxIndex]=-1;

        }
        return answer;
        
    }
}
