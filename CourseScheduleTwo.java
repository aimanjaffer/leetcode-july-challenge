import java.util.*;
class CourseScheduleTwo{
    public int[] findOrder(int n, int[][] prereq) {
    
        Map<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<Integer>());
        }
        int[] indegree = new int[n];
        Arrays.fill(indegree,0);
        for(int[] arr: prereq){
            map.get(arr[0]).add(arr[1]);
            indegree[arr[1]]++;
            
        }
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> visited = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int course = queue.poll();
            visited.add(course);
            for(Integer i : map.get(course)){
                indegree[i]--;
                if(indegree[i] == 0 && !visited.contains(i)){
                    queue.offer(i);
                }
            }
        }
        int[] result = new int[visited.size()];
        for(int i=0;i<visited.size();i++)
            result[visited.size()-i-1] = visited.get(i);
        return visited.size() != n ? new int[0] : result;
}
}