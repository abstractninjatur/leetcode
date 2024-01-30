package Tree;

import java.util.List;

public class BST {

    TreeNode root;

    public BST(List<Integer> values){
        createBST(values);
    }


    private void createBST(List<Integer> values) {
        root = new TreeNode(values.get(0));

        for (int i = 1; i < values.size(); i++) {
            root = add(root, values.get(i));
        }
    }

    public TreeNode add(TreeNode node, int value){
        if(node == null ){
            node = new TreeNode(value);
            return node;
        }

        if(node.val > value){
            node.left = add(node.left, value);
        }
        else {
            node.right = add(node.right, value);
        }

        return node;
    }





}
