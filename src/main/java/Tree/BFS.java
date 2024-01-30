package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {



    public BFS( ){

    }

    public List<TreeNode> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> levelOrderTraversal = new ArrayList<>();

        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode curr = queue.remove();
            System.out.print(curr.val + " ");
            if(curr!=null) {
                queue.add(curr.left);
                queue.add(curr.right);
            }

        }

        return levelOrderTraversal;
    }




    public void inOrder(TreeNode node){
        if(node ==null ) return;

        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }



}
