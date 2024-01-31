package Tree;

import java.util.List;

public class BinaryTree {

    public TreeNode root;

    public BinaryTree(List<Integer> values){
        createCompleteBinaryTree(values);
    }

    public BinaryTree(TreeNode root){
        this.root = root;
    }

    private TreeNode createBinaryTree(List<Integer> values, int index){

        if(index >= values.size()) return null;

        TreeNode node = new TreeNode(values.get(index));

        node.left = createBinaryTree(values, 2*index+1);
        node.right = createBinaryTree(values, 2*index+2);

        return node;
    }




    public void createCompleteBinaryTree(List<Integer> values){
        root = createBinaryTree(values,0);
    }


    public static void main(String[] args) {

        List<Integer> valueList =  List.of(1,2,3,4,5,6,7,8);
        BinaryTree bTree = new BinaryTree(valueList);
        BFS bfs = new BFS();

        bfs.inOrder(bTree.root);

        BST bst = new BST(valueList);

        bst.addNewValue(10);


        bfs.inOrder(bst.root);


    }


}
