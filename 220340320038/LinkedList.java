class LinkedList{

 Node head;
 class Node{

int data;
Node next;

Node(int d)
{
  data = d;
  next =null;
  
  }
 }

Node reverse(Node node)

{

    Node prev=null;
    NOde current=node;
    Node next=null;

    while(current!=null){
     next=current.next;
	 current.next=prev;
	 prev=current;
	 current=next;
}

     node=prev;
     return node;
   }
    
     void printlist(Node node)

     {
       while(node!=null)
        System.out.print(node.value +" ");
         node=node.next;
    }
    }
       
        public static void main(String [] args)
		{
             LinkedList list = new LinkList();
               list.head = new Node(1);
               list.head.next = new Node(5);
               list.head.next.next = new Node(1);
               list.head.next.next.next = new Node(2);  
	           list.head.next.next.next.next=new Node(3);  
			   list.head.next.next.next.next.next=new Node(4);
			   list.head.next.next.next.next.next.next=new Node(5);
			   
			   System.out.println("before linkedlist");
			   list.printList(head);
			   head=list.reverse(head);
			   System.out.println("");
			   System.out.println("Reversed linkedlist");
			   list.printlist(head);
		}
            }			 