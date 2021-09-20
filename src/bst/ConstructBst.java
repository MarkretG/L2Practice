/**
 * Input:
 * N = 9
 * BST[] = {7,4,12,3,6,8,1,5,10}
 * Output: 7 4 3 1 6 5 12 8 10
 * Explanation: After constructing BST, the
 * preorder traversal of BST is
 * 7 4 3 1 6 5 12 8 10.

 */

package bst;

import java.util.ArrayList;
import java.util.List;

public class ConstructBst {
    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    List<Integer> list=new ArrayList<>();
    public List<Integer> preOrder(Node root)
    {
        if(root!=null)
        {
            list.add(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
        return list;
    }
    public Node insert(Node root, int key)
    {
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        if(key<root.data)
        {
            root.left=insert(root.left,key);
        }
        else if (key>root.data)
        {
            root.right=insert(root.right,key);
        }
        else {
            System.out.println("duplicates doesn't allowed");
            System.exit(0);
        }
        return root;
    }
    private Node constructBst(int[] arr)
    {
        if(arr.length==0)
        {
            return null;
        }
        Node root=null;
        for (int i=0;i<arr.length;i++)
        {
            root=insert(root,arr[i]);
        }
        return root;

    }
    public static void main(String[] args) {
        ConstructBst constructBst=new ConstructBst();
        int[] arr={7,4,12,3,6,8,1,5,10};
        Node root=constructBst.constructBst(arr);
        List<Integer> list=constructBst.preOrder(root);
        System.out.println(list);

    }
}
