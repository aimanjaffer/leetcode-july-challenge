/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;
import java.util.stream.*;
class BinaryTreeZigZagLevelOrderTraversal{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(root,1,map);  
        
       // System.out.println(map);
        for(Map.Entry e : map.entrySet()){
            Integer key = (Integer) e.getKey();
            List<Integer> l = (List<Integer>)(e.getValue());
            if( key % 2 == 0 ){             
                List<Integer> list =    l
                                        .stream()
                                        .collect(Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        v -> {
                                                Collections.reverse(v);
                                                return v;
                                            }));
                result.add(new ArrayList<Integer>(list));
            }
            else{
                result.add(new ArrayList<Integer>(l));
            }
        }
        return result;
    }
    
    public void helper(TreeNode root, int level, Map<Integer,List<Integer>> map){
        if(root==null){
            return;
        }
        if(map.containsKey(level)){
            map.get(level).add(root.val);
        }
        else{
            List<Integer> list = new ArrayList<Integer>();
            list.add(root.val);
            map.put(level,list);
        }
        helper(root.left,level+1,map);
        helper(root.right,level+1,map);
    }
}