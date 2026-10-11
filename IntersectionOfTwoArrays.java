class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();//hashset because it removes duplicates
        for(int num:nums1){
            set.add(num);


        }
        int[] arr=new int[Math.min(nums1.length,nums2.length)];//Math.min gives you the smallest from two objects
        int i=0;
        for(int num:nums2){
            if(set.contains(num)){
                arr[i]=num;
                i++;
                set.remove(num);
            }


        }
        return Arrays.copyOf(arr,i);





        
        
    }
}
