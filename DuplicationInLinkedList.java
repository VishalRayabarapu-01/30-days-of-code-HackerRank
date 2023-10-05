import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class DuplicationInLinkedList
{
static List<Integer> list=new java.util.ArrayList<>();
    public static Node removeDuplicates(Node head) {
      //Write your code here
        Node currentNode=head.next,prevNode=head;
        list.add(head.data);
        while(currentNode!=null){
            if(!list.contains(currentNode.data)){
                list.add(currentNode.data);
            }
            else{
                //ex : take 1,1,1 we use continue because again prevNode is changing again that leads to duplication of currentNode so skip the below code after else.....
                prevNode.next=currentNode.next;
                currentNode=currentNode.next;
                continue;
            }
            prevNode=currentNode;
            currentNode=currentNode.next;
        }
        return head;
    }
	 public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }