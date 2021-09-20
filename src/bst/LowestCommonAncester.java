/**
 * Given a Binary Search Tree (with all values unique) and two node values. Find the Lowest Common Ancestors of the two nodes in the BST.

 Input:
   5
 /    \
 4       6
 /         \
 3           7
 \
 8
 n1 = 7, n2 = 8
 Output: 7

 */

package bst;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class LowestCommonAncester {
    Node root;
    private Node leastCommonAncestor(Node root,int n1,int n2)
    {
        while (root!=null)
        {
            if(root.data<n1&&root.data<n2)
            {
                root=root.right;
            }
            else if(root.data>n1&&root.data>n2)
            {
                root= root.left;
            }
            else {
                break;
            }
        }
        return root;
    }
    public static void main(String[] args) {
        LowestCommonAncester tree = new  LowestCommonAncester();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);

        int n1 = 10, n2 = 14;
        Node n=tree.leastCommonAncestor(tree.root,n1,n2);
            System.out.println(n.data);

    }

}
