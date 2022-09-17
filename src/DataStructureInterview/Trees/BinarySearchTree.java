package DataStructureInterview.Trees;

public class BinarySearchTree {

    Node root;


    class Node{

        int key;
        Node left,right;
        public Node(int val){
            this.key=val;
            this.left=null;
            this.right=null;
        }
    }

    public BinarySearchTree(int rootValue)
    {
        root= new Node(rootValue);
    }

    public Node insert(Node root,int value)
    {

        if(root==null)
        {
            return new Node(value);
        }

        if(value<root.key)
        {
            //assign the value left side
            root.left=insert(root.left,value);
        }

        if(value>root.key)
        {
            //assign the value right side
            root.right=insert(root.right,value);
        }

        return root;

    }

    public void viewBST(Node root)
    {
        System.out.println(root.key);
        System.out.println(root.left.key);
        System.out.println(root.left.right.key);
        System.out.println(root.right.key);

    }

    public void viewBinaryTree(Node root)
    {
        if(root!=null)
        {
            viewBinaryTree(root.left);
            System.out.println(root.key + " ");
            viewBinaryTree(root.right);
        }
    }

    public Node searchValue(Node root,int inputValue)
    {
        if(root ==null ||root.key==inputValue)
        {
            return root;
        }

        if(inputValue<root.key)
        {
            return searchValue(root.left,inputValue);
        }
        else {
            return searchValue(root.right,inputValue);
        }

    }

    public Node myView(Node root)
    {
            while (root!=null)
            {
                System.out.println(root.key);
                if(root.left!=null)
                {
                    root=root.left;
                }
                else if(root.right!=null)
                {
                    root=root.right;

                }

            }

            return root;
    }
}
