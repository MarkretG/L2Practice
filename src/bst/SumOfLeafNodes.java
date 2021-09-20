/**
 * Explanation:
 * In first test case, the BST for the given input will be-
 *
 *                67
 *
 *           /        \
 *
 *    34               82
 *
 *   /    \             /
 *
 * 12   45            78
 *
 * Hence, the required sum= 12 + 45 + 78 = 135

 */
package bst;
public class SumOfLeafNodes {
    static class Node
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
    public void inorderRec(Node root)
    {
        if(root!=null)
        {
            inorderRec(root.left);
            System.out.print(root.key+" ");
            inorderRec(root.right);
        }
    }
    private static Node insertRec(Node root, int key)
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
    private static int getSumOfLeafNodes(Node root)
    {
        int sum=0;
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
        {
            return root.key;
        }
        return sum+getSumOfLeafNodes(root.left)+getSumOfLeafNodes(root.right);
    }
    public static void main(String[] args) {
        Node root=null;
        int[] arr={67, 34, 82 ,12, 45, 78};
        root=insertRec(root,arr[0]);
        for(int i=1;i< arr.length;i++)
        {
         root=insertRec(root,arr[i]);
        }
        int result=getSumOfLeafNodes(root);
        System.out.println(result);
    }
}