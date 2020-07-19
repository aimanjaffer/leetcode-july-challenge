import java.util.*; 
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
      }
  }

class MaxWidthOfBinaryTree{
 Map<Integer,Integer> leftMostPositions;
    int maxWidth;
    public int widthOfBinaryTree(TreeNode root) {
        maxWidth=0;
        leftMostPositions = new HashMap<Integer,Integer>();
        helper(root,0,1);
        //System.out.println(leftMostPositions);
        return maxWidth;    
    }
    public void helper(TreeNode root, int depth, int position){
        if(root==null)
            return;
        leftMostPositions.computeIfAbsent(depth, x -> position);
        maxWidth = Math.max(maxWidth, position - leftMostPositions.get(depth) + 1);
        helper(root.left,depth+1,2*position);
        helper(root.right,depth+1,2*position+1);
    }
}