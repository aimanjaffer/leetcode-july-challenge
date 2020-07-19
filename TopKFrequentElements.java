import java.util.*;
class TopKFrequentElements{
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqCount = new HashMap<>();
        int[] result = new int[k];
        PriorityQueue<Value> pq = new PriorityQueue<>((a,b) -> b.freq - a.freq );
        
        // O(n)
        for(int i=0;i<nums.length;i++){
            freqCount.put(nums[i],freqCount.getOrDefault(nums[i], 0)+1);
        }
        
        // O(n)
        for(Map.Entry<Integer,Integer> entry : freqCount.entrySet()){
            Value a = new Value(entry.getKey(),entry.getValue());
            pq.offer(a);
        }
        
        // O(k)
        for(int i = 0;i<k;i++){
            Value a = pq.poll();
            result[i] = a.value;
        }
        return result;
    }
    
    private class Value{
        Integer value;
        Integer freq;
        Value(Integer value, Integer freq){
            this.value = value;
            this.freq = freq;
        }
    }
}