package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    Queue<TreeNode> queue;

    public BFS(Queue<TreeNode> queue){
        this.queue = new LinkedList<>();
    }

    public List<TreeNode> levelOrder(TreeNode root){
        List<TreeNode> levelOrderTraversal = new ArrayList<>();

        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode curr = queue.remove();
            levelOrderTraversal.add(curr);
            queue.add(curr.left);
            queue.add(curr.right);
        }

        return levelOrderTraversal;
    }



}
