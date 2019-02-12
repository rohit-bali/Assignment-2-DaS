import java.util.*;
class Node
{
	int data;
	Node next;

	Node(int data)
	{
		this.data=data;
	}
}
class Linklist
{
	Node head;
	public void insertEnd(int data)
	{
		Node node = new Node(data);
 		if(head == null)
		{
			head = node;
		}
		else 
		{
			Node current;
			current = head;
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = node;
		}
	}

	public void insertBeg(int data)
	{
		Node node = new Node(data);
		if(head == null)
		{
			head = node;
		}
		else
		{
			node.next = head;
			head = node;
		}
	}
	public void insertMid(int data,int pos)
	{
		Node current = head;
		Node node1=new Node(data);
		for(int i=1; i<pos-1; i++){
			if(current == null){
				System.out.println("out of range");
				return;	
			} 
			current= current.next;
		}
		node1.next= current.next;
		current.next= node1;
	}
	public void deleteBeg()
	{
		Node node=head;
		if(head == null)
		{
			System.out.println("list is empty");
		}
		else
		{
			head = head.next;
			node.next = null;
		}
	}
	public void deleteEnd()
	{
		if(head == null)
		{
		 System.out.println("list is empty");	
		}
		else
		{
			Node current;
			Node pre;
			pre =  head;
			current = head;
			while(current.next != null)
			{
				pre = current;
				current = current.next;
			}
			if(pre == current)
			{
				head = null;
			}
			pre.next = null;

		}

	}
	  public Node deletionAny(Node head,int pos){

        if(pos == 0){
            return head.next;
        }
        head.next = deletionAny(head.next,pos-1);
        return head;
    }

	public void traverse()
	{
		if(head == null)
		{
		  System.out.println("list is empty");
		}
		else
		{
			Node current;
			current = head;
			System.out.println("list elements are : ");
			while(current != null)
			{
				System.out.println(current.data);
				current = current.next;
			}
		}
	}

	public void traverseReverse(Node node){
		if(node.next==null){
			System.out.println(node.data);
			return;
		}
		traverseReverse(node.next);
		System.out.println(node.data);
	}

}

public class singlelinklist
{
	public static void main(String[] args) {
		Linklist list =new Linklist();
		int pos;
		for(int i=1;i<=5;i++)
		{
			list.insertEnd(i);
		}
		// list.traverseReverse(list.head);
		// list.insertMid(9,6);
		// list.deleteBeg();
		// list.deleteEnd();
		list.deletionAny(list.head,2);
		list.traverse();
	}
}





