import java.util.*;
class AllPathsFromSourceToTarget{
public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<graph.length;i++){
            map.put(i, new ArrayList<Integer>());
            for(int j : graph[i]){
                map.get(i).add(j);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        current.add(0);
        //System.out.println("map:"+map);
        helper(map,result,current,0,graph.length-1);
        return result;
    }
    public void helper(Map<Integer,List<Integer>> map, List<List<Integer>> result, List<Integer> current, int source, int destination){
       // System.out.println("result: "+result);
       // System.out.println("current: "+current);
        if(current.get(current.size()-1) == destination){
            result.add(new ArrayList<Integer>(current));
            return;
        }else if(!(map.get(source).isEmpty())){
            for(int i : map.get(source)){
                current.add(i);
                helper(map,result,current,i, destination);
                current.remove(current.size()-1);
            }    
        }
        
    }
}