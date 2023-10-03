import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BST{

	public static int getHeight(Node root){
      //Write your code here
      return bstHeight(root,0);
    }
    public static int bstHeight(Node root,int level){
        int heightRight=0,heightLeft=0;
        if(root.left!=null){
            int newLevel=level+1;
            heightLeft=bstHeight(root.left,newLevel);
            heightLeft=Math.max(heightLeft,newLevel );
        }
        if(root.right !=null){
            int newLevel=level+1;
            heightRight=bstHeight(root.right,newLevel);
            heightRight=Math.max(heightRight,newLevel );
        }
        return Math.max(heightRight, heightLeft);
    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}