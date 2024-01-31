package Tree;

import java.util.*;

public class BFS {



    public BFS( ){

    }

    public List<TreeNode> levelOrder(TreeNode root){
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<TreeNode> levelOrderTraversal = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        sb.append("Tree : ");
        queue.add(root);
        while(!queue.isEmpty()) {
            printQueue(queue);
            TreeNode curr = queue.remove();
            sb.append(curr.val+" ");
            System.out.print(sb);
            if(curr.left!=null)
                queue.add(curr.left);
            if(curr.right!=null)
                queue.add(curr.right);

        }

        return levelOrderTraversal;
    }


    public void zigzagLevelOrder(TreeNode root) {

        Stack<TreeNode> currentLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();

        currentLevel.push(root);
        boolean leftToRight = true;
        while (!currentLevel.isEmpty()) {
            TreeNode node = currentLevel.pop();

            System.out.print(node.val + " ");
            if (leftToRight) {
                if (node.left != null) nextLevel.push(node.left);
                if (node.right != null) nextLevel.push(node.right);
            } else {
                if (node.right != null) nextLevel.push(node.right);
                if (node.left != null) nextLevel.push(node.left);
            }

            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;

                Stack<TreeNode> tmp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = tmp;
            }
        }

    }

    private void printQueue(LinkedList<TreeNode> queue) {

        System.out.print("\nQueue: ");
         for(int i=queue.size()-1;i>=0;i--){
             System.out.print( queue.get(i).val+ "|");
         }
         System.out.println();

    }



    public void inOrder(TreeNode node){
        if(node ==null ) return;

        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }



}
