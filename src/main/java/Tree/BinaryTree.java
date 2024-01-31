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

        List<Integer> valueList =  List.of(5,4,1,7,2,3,6,8);
        BinaryTree bTree = new BinaryTree(valueList);
        BFS bfs = new BFS();

//        bfs.inOrder(bTree.root);

        BST bst = new BST(valueList);

        System.out.println("\nLevel Order : ");

        bfs.levelOrder(bst.root);

        System.out.println("\nAdding value 10 to this tree.....");

        bst.addNewValue(10);

        System.out.println("New Values : ");


        System.out.println("\nLevel Order : ");

        bfs.levelOrder(bst.root);

        System.out.println("\nBST in ZigZag Order : \n");
        bfs.zigzagLevelOrder(bst.root);


    }


}
