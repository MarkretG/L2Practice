/**
 * You are given the root of a binary search tree (BST) and an integer val.
 *
 * Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
 *
 *Input: root = [4,2,7,1,3], val = 2
 * Output: [2,1,3]

 */

package bst;
import java.util.ArrayList;
import java.util.List;
public class SearchBst {
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
    public Node searchBinarySearchTree(Node root,int val)
    {
        if(root==null)
            return  null;
        if(root.data==val)
        {
            return root;
        }
        else if(root.data<val)
        {
            return searchBinarySearchTree(root.right,val);
        }
        else
        {
            return searchBinarySearchTree(root.left,val);
        }
    }
    public static void main(String[] args) {
        SearchBst searchBst=new SearchBst();
        Node root=null;
        int[] arr={4,2,7,1,3};
        int val=5;
        root= searchBst.insert(root,arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            searchBst.insert(root,arr[i]);
        }
        root= searchBst.searchBinarySearchTree(root,val);
        List<Integer> list=searchBst.preOrder(root);
        System.out.println(list);

    }
}
