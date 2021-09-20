package bst;
public class BinaryTreeDelete {
    class Node{
        int data;
        Node left,right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    Node root;
    BinaryTreeDelete()
    {
        root=null;
    }
    public  void  deleteKey(int key)
    {
        root=deleteRec(root,key);
    }
    private Node deleteRec(Node root,int key) {
        //tree is empty
        if (root == null) {
            return root;
        }
        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.data = findInOrderSuccessor(root);
                //delete inorderSuccessor
                root.right=deleteRec(root.right,root.data);
            }
        }
     return root;
    }
    private Node insertRec( Node root, int key)
    {
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        else if(root.data<key)
        {
            root.right=insertRec(root.right,key);
        }
        if(root.data>key)
        {
            root.left=insertRec(root.left,key);
        }
        return root;
    }
    public void insert(int key)
    {
        root=insertRec(root,key);
    }
    private int findInOrderSuccessor(Node root)
    {
        int min=root.data;
        while (root.left!=null)
        {
            min=root.left.data;
            root=root.left;
        }
        return min;
    }
    public void inorder()
    {
        inorderRec(root);
    }
    public void inorderRec(Node root)
    {
        if(root!=null)
        {
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeDelete binaryTreeDelete=new BinaryTreeDelete();
        binaryTreeDelete.insert(50);
        binaryTreeDelete.insert(30);
        binaryTreeDelete.insert(20);
        binaryTreeDelete.insert(40);
        binaryTreeDelete.insert(70);
        binaryTreeDelete.insert(80);
        binaryTreeDelete.insert(60);

        binaryTreeDelete.inorder();
        binaryTreeDelete.deleteKey(20);
        System.out.println();
        binaryTreeDelete.inorder();
        binaryTreeDelete.deleteKey(40);
        System.out.println();
        binaryTreeDelete.inorder();
        binaryTreeDelete.deleteKey(50);
        System.out.println();
        binaryTreeDelete.inorder();

    }
}
