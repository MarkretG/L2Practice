import java.util.ArrayList;
import java.util.List;

/**
 * Input: root = [1,0,2], low = 1, high = 2
 * Output: [1,null,2]

 */
public class Trim {
    class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
           this.data=data;
           this.left=null;
           this.right=null;
        }
    }
    List<Integer> list=new ArrayList<>();
    int k=0;
    private List<Integer> inOrder(Node root)
    {
        if(root!=null)
        {

           /* System.out.print(root.data+" ");
            if(k==0)
            {
                System.out.print("null"+" ");
                k++;
            }*/
            inOrder(root.left);
            list.add(root.data);
            inOrder(root.right);
        }
        return list;
    }
    private Node insert(Node root,int key)
    {
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        if(root.data<key)
        {
            root.right=insert(root.right,key);
        }
        if(root.data>key)
        {
            root.left=insert(root.left,key);
        }
        return root;
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
    private int findInOrderSuccessor(Node root)
    {
        /*if(root==null)
        {
            return ;
        }*/
        int min=root.data;
        while (root.left!=null)
        {
            min=root.left.data;
            root=root.left;
        }
        return min;
    }
    /*private Node trimBst(Node root,int low,int high)
    {
        if(root==null)
        {
            return null;
        }
        root.left=trimBst(root.left,low,high);
        root.right=trimBst(root.right,low,high);

        if(root.data<low)
        {
            Node rChild=root.right;
            return rChild;
        }
        else if(root.data>high)
        {
            Node lChild=root.left;
            return lChild;
        }
        return root;
    }*/
    public static void main(String[] args) {
        Node root=null;
        int[] arr={1,2,3,4,5,6,7,8};
        int low=1,high=4;
        Trim trim=new Trim();
        root=trim.insert(root,arr[0]);
        for (int i=1;i<arr.length;i++) {
            trim.insert(root,arr[i]);
        }
        List<Integer> list=trim.inOrder(root);
        //System.out.println(list);
        for (Integer l:list)
        {
           // System.out.println("list:"+l);
            if(l<low||l>high)
            {
             root=trim.deleteRec(root,l);
            }
        }
        list.clear();
        System.out.println(trim.inOrder(root));
        System.out.println();
    }
}
