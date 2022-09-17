package DataStructureInterview.Trees;

public class BinarySearchDeletion {

    //{https://www.youtube.com/watch?v=C_7RDUMMqo8
    // logic first tamil}

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(50);

        bst.insert(bst.root, 20);
        bst.insert(bst.root, 25);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 10);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 55);
        bst.insert(bst.root, 90);
        bst.insert(bst.root, 80);
        bst.insert(bst.root, 75);

        bst.viewBinaryTree(bst.root);
        deleteLogic(bst.root,70);
        System.out.println("testing .....");
        bst.viewBinaryTree(bst.root);
    }


    static BinarySearchTree.Node deleteLogic(BinarySearchTree.Node root,int value)
    {
        if(root==null)
        {
            return root;
        }

        if(value<root.key)
        {
            root.left=deleteLogic(root.left,value);
        }
        else if (value> root.key)
        {
          root.right=  deleteLogic(root.right,value);
        }

        else
        {
            if(root.right==null)
            {
                return root.left;
            }
            else if(root.left==null)
            {
                return root.right;
            }
            root.key=findMinimum(root.right);

            root.right=deleteLogic(root.right,root.key);
        }
        return root;
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
}
