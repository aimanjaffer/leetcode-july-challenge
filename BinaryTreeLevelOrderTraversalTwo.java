
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
import java.util.stream.Collectors;
class BinaryTreeLevelOrderTraversalTwo{
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       
        Map<Integer,List<Integer>> levelMap = new HashMap<>();
        helper(root,1,levelMap);
        List<List<Integer>> result = levelMap.entrySet()
                                             .stream()
                                             .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                                             .map(x -> x.getValue())
                                             .collect(Collectors.toList());
        return result;
    }
    
    
    public void helper(TreeNode root, int level, Map<Integer,List<Integer>> map){
        if (root==null){
            return;
        }
        if(map.containsKey(level)){
            map.get(level).add(root.val);
        }else{
            List<Integer> list= new ArrayList<Integer>();
            list.add(root.val);
            map.put(level, list);
        }
        helper(root.left,level+1,map);
        helper(root.right,level+1,map);
    }
}