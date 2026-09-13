import java.util.*;
public class AppearsOnlyOnce {
    public static void main(String[] args){
        int[] arr={4,2,7,2,4,9,7,5};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int frequency=map.getOrDefault(arr[i], 0);
            frequency=frequency+1;
            map.put(arr[i],frequency);

        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                System.out.println(arr[i]);
                break;
            }
        }
        
    }
    
}
