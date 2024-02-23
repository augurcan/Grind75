package Week3;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    Map<Node,Node> map= new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Node newNode= new Node(node.val);
        map.put(node, newNode);
        for(Node n: node.neighbors){
            if(map.containsKey(n)) newNode.neighbors.add(map.get(n));
            else newNode.neighbors.add(cloneGraph(n));
        }
        return newNode;
    }
}