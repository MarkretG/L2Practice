/**
 *
 Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
 Output: 32
 Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.

 */

package bst;
import java.util.ArrayList;
import java.util.List;
public class RangeOfSum {
   static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    List<Integer> list=new ArrayList<>();
    public List<Integer> preOrder(ConstructBst.Node root)
    {
        if(root!=null)
        {
            list.add(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
        return list;
    }
    public static Node insert(Node root, int key)
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
    public static int rangeOfSumBst(Node root,int low,int high)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.data<low)
        {
            return rangeOfSumBst(root.right,low,high);
        }
        if(root.data>high)
        {
            return rangeOfSumBst(root.left,low,high);
        }
        return root.data+rangeOfSumBst(root.left,low,high)+rangeOfSumBst(root.right,low,high);

    }
    public static void main(String[] args) {
        Node root=null;
        Integer[] arr={10,5,15,3,7,null,18};
        int low=7,high=15;
        root=insert(root,arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=null) {
                insert(root, arr[i]);
            }
        }
        int result=rangeOfSumBst(root,low,high);
        System.out.println(result);

    }
}
