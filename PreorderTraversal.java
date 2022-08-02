public class PreorderTraversal {

    class Node {
        public int data;
        public Node left;
        public Node right;
    }

    //HackerRanks solution for preorder traversal problem (advanced)
    //https://www.hackerrank.com/challenges/tree-preorder-traversal/problem
    public static void preOrder(Node root) {
        if(root == null) return;
        else{
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

}
