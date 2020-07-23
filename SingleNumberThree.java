import java.util.*;
class SingleNumberThree{
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int i : nums){
            countMap.put(i, countMap.getOrDefault(i,0)+1);
        }
        int[] result = new int[2];
        int i=0;
        for(Map.Entry<Integer,Integer> e : countMap.entrySet()){
            if(e.getValue() == 1)
                result[i++] = e.getKey();
        }
        return result;
    }
}