/**
 * Input:
 *           20
 *         /    \
 *        8     22
 *      /    \
 *     4     12
 *          /    \
 *         10    14   , K=3
 *
 * Output: 22
 * Explanation:
 * Sum of 3 smallest elements are:
 * 4 + 8 + 10 = 22

 */

package bst;

import java.util.ArrayList;
import java.util.List;

public class SumOfKElements {
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
    List<Integer> list=new ArrayList<>();

    private void inOrderRec(Node root)
    {
        if(root!=null)
        {
            inOrderRec(root.left);
            list.add(root.data);
            inOrderRec(root.right);
        }
    }

    private Node insertRec(Node root, int key)
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
    private int getSumOfKElements(int k)
    {
        System.out.println(list);
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=list.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfKElements sumOfKElements=new SumOfKElements();
        Node root=null;
        int[] arr={20,8,22,4,12,10,14};
        root=sumOfKElements.insertRec(root,arr[0]);
        int k=3;
        for(int i=1;i<arr.length;i++)
        {
            sumOfKElements.insertRec(root,arr[i]);
        }
        sumOfKElements.inOrderRec(root);
        int sum= sumOfKElements.getSumOfKElements(k);
        System.out.println(sum);

    }
}
