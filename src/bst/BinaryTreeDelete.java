package bst;
public class BinaryTreeDelete {
    static  Node mainRoot=null;
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
                root.data = findInOrderSuccessor(root.right);
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

    private int findInOrderSuccessor(Node root)
    {
        if(root==null)
        {
            return mainRoot.data;
        }
        int min=root.data;
        while (root.left!=null)
        {
            min=root.left.data;
            root=root.left;
        }
        return min;
    }
    public void inorderRec(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            inorderRec(root.left);
            inorderRec(root.right);


        }
    }

    public static void main(String[] args) {
        BinaryTreeDelete binaryTreeDelete=new BinaryTreeDelete();

       binaryTreeDelete.mainRoot =  binaryTreeDelete.insertRec(mainRoot,20);
        binaryTreeDelete.insertRec(mainRoot,10);
        binaryTreeDelete.insertRec(mainRoot,25);
        binaryTreeDelete.insertRec(mainRoot,8);
        binaryTreeDelete.insertRec(mainRoot,15);
        binaryTreeDelete.insertRec(mainRoot,27);
        binaryTreeDelete.insertRec(mainRoot,30);

        binaryTreeDelete.inorderRec(mainRoot);
        binaryTreeDelete.deleteRec(mainRoot,10);
        System.out.println();
        binaryTreeDelete.inorderRec(mainRoot);
        /*.deleteKey(40);
        System.out.println();
        binaryTreeDelete.inorder();
        binaryTreeDelete.deleteKey(50);
        System.out.println();
        binaryTreeDelete.inorder();
*/
    }
}
