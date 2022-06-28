import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode (int val){
        this.val = val;
        left = null;
        right = null;
    }
}

public class BinaryTreeLevelOrderTraversal102 {

    //91.68% runtime, 84.33% memory solution for LeetCode 102
    public List<List<Integer>> levelOrder(TreeNode root) {
        int row = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();

        levelOrder(root, map, row);

        List<List<Integer>> output = new LinkedList<>(map.values());

        return output;

    }

    public static void levelOrder (TreeNode root, Map<Integer, List<Integer>> map, int level){
        if(root == null) return;
        if(!map.containsKey(level)){
            map.put(level, new LinkedList<>());
        }
        map.get(level).add(root.val);

        levelOrder(root.left, map, level+1);
        levelOrder(root.right, map, level+1);
    }
}
