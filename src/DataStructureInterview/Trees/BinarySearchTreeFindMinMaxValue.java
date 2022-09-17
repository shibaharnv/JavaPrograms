package DataStructureInterview.Trees;

public class BinarySearchTreeFindMinMaxValue {

    //{Logic to find the minimum value in the Binary tree
    // Pass the root as the input parameter
    // binary tree logic is minimum values will be on left
    // from root node we need to navigate to left until it become null so use wile loop
    // after navigating to left get key and compare with min value}

    public static void main(String[] args) {

        BinarySearchTree bst= new BinarySearchTree(50);

        bst.insert(bst.root, 40);
        bst.insert(bst.root, 60);
        bst.viewBinaryTree(bst.root);
        int minvalue=findMinimum(bst.root);
        System.out.println("minvalue " +minvalue);

        int max=findMaximum(bst.root);
        System.out.println("max " +max);



    }

    static int findMinimum (BinarySearchTree.Node root)
    {
        int minValue=root.key;
        while (root.left!=null)
        {
            minValue=root.left.key;
            root=root.left;

        }
        return minValue;
    }

    static int findMaximum(BinarySearchTree.Node root)
    {
        int maxValue= root.key;

        while (root.right!=null)
        {
            maxValue=root.right.key;
            root=root.right;
        }

        return maxValue;
    }
}
