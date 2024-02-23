package Week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalAnswer= new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return finalAnswer;
        queue.add(root);
        while(!queue.isEmpty()){
            int levels=queue.size();
            List<Integer> subLevels = new ArrayList<>();
            for(int i=0;i<levels;i++){
            if(queue.peek().left!=null) queue.add(queue.peek().left);
            if(queue.peek().right!=null) queue.add(queue.peek().right);
            subLevels.add(queue.remove().val);
            }
            finalAnswer.add(subLevels);
        }
        return finalAnswer;
    }
}