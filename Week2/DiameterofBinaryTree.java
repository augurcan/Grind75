package Week2;

public class DiameterofBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter=0;
        height(root, diameter);
        return diameter;
    }
    public int height(TreeNode root, int diameter){
        if(root==null) return 0;
        int left=height(root.left, diameter);
        int right=height(root.right, diameter);
        diameter=Math.max(diameter,left+right);
        return Math.max(left,right)+1;
    }
}
