package DataStructureInterview.Trees;

public class BinarySearchTreeMainMethod {

    public static void main(String[] args) {
        BinarySearchTree bst= new BinarySearchTree(50);

        bst.insert(bst.root, 40);
        bst.insert(bst.root, 60);
        bst.viewBinaryTree(bst.root);

        bst.myView(bst.root);

        if(bst.searchValue(bst.root,40) ==null)
        {
            System.out.println("Not found");
        }
        else {
            System.out.println("Found");
        }


    }
}
