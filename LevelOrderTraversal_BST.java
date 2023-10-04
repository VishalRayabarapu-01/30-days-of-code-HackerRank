import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class LevelOrderTraversal_BST{
static Queue<Node> visitedQueue=new LinkedList<>();
static void levelOrder(Node root){
      //Write your code here
      visitedQueue.add(root);
      Node n;
      while(true){
          n=visitedQueue.poll();
          if(n.left != null){
              visitedQueue.add(n.left);
          }
          if(n.right !=null){
            visitedQueue.add(n.right);    
          }  
          System.out.print(n.data+" ");
          if(visitedQueue.size()==0){
              break;
          }
      }
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
            levelOrder(root);
        }	
}