
/**
 Input:
   2
 /   \
 1     3
 K = 4
 Output: 1 2 3 4
 Explanation: After inserting the node 4
 Inorder traversal will be 1 2 3 4.
 */

package bst;
public class BinaryTreeInsert {
    class Node
    {
        int key;
        Node left,right;
       Node(int key)
        {
            this.key=key;
            this.left=null;
            this.right=null;
        }
    }
    Node root;
    BinaryTreeInsert()
    {
        root=null;
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
            System.out.print(root.key+" ");
            inorderRec(root.right);
        }
    }
    private Node insertRec(Node root,int key)
    {
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        else if(root.key<key)
        {
            root.right=insertRec(root.right,key);
        }
        if(root.key>key)
        {
            root.left=insertRec(root.left,key);
        }
        return root;
    }
    public void insert(int key)
    {
       root=insertRec(root,key);
    }
    public static void main(String[] args) {
        Node root=null;
        BinaryTreeInsert binaryTreeInsert=new BinaryTreeInsert();
        binaryTreeInsert.insert(2);
        binaryTreeInsert.insert(1);
        binaryTreeInsert.insert(3);
        binaryTreeInsert.insert(6);
        int k=4;
        binaryTreeInsert.insert(k);
        binaryTreeInsert.inorder();
    }
}
