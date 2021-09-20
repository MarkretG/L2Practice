/**
 *
 * Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.
 * Input: root = [4,2,6,1,3]
 * Output: 1

 */

package bst;
import java.util.ArrayList;
import java.util.List;

public class MinimumDifferenceBst {
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
        public Node insert(Node root,int key)
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
    public List<Integer> inOrderRec(Node root)
    {
        if(root!=null)
        {
            inOrderRec(root.left);
            list.add(root.data);
            inOrderRec(root.right);
        }
        return list;
    }

    public static void main(String[] args){
        int min=Integer.MAX_VALUE;
        MinimumDifferenceBst minimumDifferenceBst=new MinimumDifferenceBst();
        Node root=null;
        Integer[] arr={1,0,48,12,49};
        root=minimumDifferenceBst.insert(root,arr[0]);
        for(int i=1;i<arr.length-1;i++)
        {
            minimumDifferenceBst.insert(root,arr[i]);
        }
        List<Integer> list=minimumDifferenceBst.inOrderRec(root);
        for (int i=0;i<list.size()-1;i++)
        {
            min=Math.min(Math.abs(list.get(i)-list.get(i+1)),min);
        }
        System.out.println(min);
}
}
