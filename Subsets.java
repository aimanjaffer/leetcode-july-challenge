import java.util.*;
import java.util.stream.*;
class Subsets{
    public List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        subsetsRecursive(result, nums, 0, new HashSet<Integer>());
        result.add(new ArrayList<Integer>());
        
        return result.stream().collect(Collectors.toList());
    }
    
    public void subsetsRecursive(Set<List<Integer>> result, int[] nums, int index, Set<Integer> current){
        if(result.size()==Math.pow(2,nums.length)-1){
            return;
        }
        else{
            for(int i=index;i<nums.length && result.size()<Math.pow(2,nums.length);i++){
                current.add(nums[i]);
               // System.out.println(current);
                List<Integer> currentList = current.stream().collect(Collectors.toList());
                if(!(result.contains(currentList)))
                    result.add(currentList);
              //  System.out.println(result);
                subsetsRecursive(result,nums,index+1,current);
                current.remove((Object)nums[i]);
            }
        }
    }
}