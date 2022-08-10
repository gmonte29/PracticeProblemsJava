import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph133 {

    //100.00% runtime, 87.29% memory solution for LeetCode 133
    //https://leetcode.com/problems/clone-graph/
    public static Node cloneGraph(Node node) {
        if(node == null) return null;
        if(node.neighbors.size()==0) return new Node(node.val);
        return cloneGraph(node, new HashMap<>());

    }

    public static Node cloneGraph(Node original,Map<Node, Node> map) {
        if(map.containsKey(original)) return map.get(original);

        map.put(original, new Node(original.val));

        Node result = map.get(original);

        for(int i = 0; i < original.neighbors.size(); i++){
            Node current = original.neighbors.get(i);

            if(map.containsKey(current)) result.neighbors.add(map.get(current));
            else result.neighbors.add(cloneGraph(current, map));
        }

        return result;

    }
}
