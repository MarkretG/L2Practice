/*
package bst;
public class CheckBst {
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

    private void inOrderRec(Node root)
    {
        if(root!=null)
        {
            inOrderRec(root.left);
            System.out.println(root.data+" ");
            inOrderRec(root.right);
        }
    }

    private Node insertRec(Node root,int key)
    {
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        if(key<root.data)
        {
            root.left=insertRec(root.left,key);
        }
        else if (key>root.data)
        {
            root.right=insertRec(root.right,key);
        }
        else {
            System.out.println("duplicates doesn't allowed");
            System.exit(0);
        }
        return root;
    }
    private boolean isBST(Node root,Node l,Node r)
    {
        if (root == null)
            return true;

        // if left node exist then check it has
        // correct data or not i.e. left node's data
        // should be less than root's data
        if (l != null && root.data <= l.data)
            return false;

        // if right node exist then check it has
        // correct data or not i.e. right node's data
        // should be greater than root's data
        if (r != null && root.data >= r.data)
            return false;

        // check recursively for every node.
        return isBST(root.left, l, root) &&
                isBST(root.right, root, r);
    }

        */
/*if (root==null)
        {
            return false;
        }
        if(currentRoot.left!=null) {
            if (!(currentRoot.left.data < currentRoot.data && root.left.data < root.data)) {
                return false;
            }
            isBST(currentRoot.left,root);
        }
        else if (currentRoot.right!=null) {
            if (!(currentRoot.right.data > currentRoot.data && root.right.data > root.data)) {
                return false;
            }
            isBST(currentRoot.right,root);
        }

        return true;*//*


    public static void main(String[] args) {
        CheckBst bst=new CheckBst();
        Node root=null;
        root=bst.insertRec(root,2);
        root.left=new Node(1);
        root.right=bst.insertRec(root,3);
        //bst.insertRec(root,1);
       // bst.insertRec(root,3);
        bst.inOrderRec(root);
        boolean result=bst.isBST(root,null,null);
        System.out.println(result);
    }
}
*/
