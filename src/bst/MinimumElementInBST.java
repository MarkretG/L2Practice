package bst;
public class MinimumElementInBST {
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
    private static int getMin(Node root)
    {
        if (root==null)
        {
            return 0;
        }
        int min=0;
        if(root.left==null)
        {
            return root.data;
        }
        while (root.left!=null)
        {
          min= root.left.data;
          root= root.left;
        }
        return min;
    }
    public static void main(String[] args) {
        MinimumElementInBST minimumElementInBST=new MinimumElementInBST();
        Node root  =null;
        root = minimumElementInBST.insertRec(root,9);
        minimumElementInBST.insertRec(root,10);
        minimumElementInBST.insertRec(root,11);
        minimumElementInBST.insertRec(root,5);
        minimumElementInBST.insertRec(root,8);
        minimumElementInBST.inOrderRec(root);
        int min=minimumElementInBST.getMin(root);
        System.out.println(min);

    }
}
