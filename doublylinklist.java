import java.util.*;
class Node
{
	Node pre;
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		this.pre = null;
		this.next = null;
	}
}
class DoublyList
{
 Node head;
 Node tail;
 int size = 0;
public void insertBeg(int data)
{
	Node node = new Node(data);
	if(head == null)
	{
		head = node;
		tail = node;
	}
	else
	{
		head.pre = node;
		node.next = head;
		head = node;
	}
	size++;

}
public void insertEnd(int data)
{
	Node node = new Node(data);
	if(head == null)
	{
		head = node;
		tail = node;
	}
	else
		{
			tail.next = node;
			node.pre = tail;
			tail = node;
		}
		size++;
}
public void insPos(int pos, int data)
    {
        Node node = new Node(data);
        Node temp = head;
        Node temp2;
        for(int i =1 ; i<pos-1 ; i++)
        {
            temp=temp.next;
        }
        temp2=temp.next;
        temp.next = node;
        temp2.pre = node;
        node.pre = temp;
        node.next = temp2;

        size++;
    }
public void deleteBeg()
{
	if(head == null)
	{
		System.out.println("list is empty");
	}
	else
	{
		Node node = head;
		head = node.next;
		node.next = null;
	}
	size--;
}
public void deleteEnd()
{
	if(tail == null)
	{
		System.out.println("list is empty");
	}
	else
	{
		Node node = tail;
		tail = tail.pre;
		tail.next = null;
	}
	size--;
}
public void deleteAtAny(int pos)
    {
        Node node = head;
        Node node1 = head;
        if(pos>size)
        {
            System.out.println("Out of range");
        }
        else
        {
            for(int i=1 ; i<pos-1 ; i++)
            {
                node=node.next;
            }
            
            if(node.next != null)
            {
                node1 = node.next.next;
                node.next = node1;
                node1.pre = node;
            }
            
        }
        size--;
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
		while(current != null)
		{
			System.out.println(current.data);
			current = current.next;
		}
	}
}
public void traverseReverse()
{
	if(tail == null)
	{
		System.out.println("list is empty");
	}
	else
	{
		Node current;
		current = tail;
		while(current != null)
		{
			System.out.println(current.data);
			current = current.pre;
		}
	}
}
}




public class doublylinklist
{
	public static void main(String[] args) {
		DoublyList d1 =new DoublyList();
		for(int i=0;i<=5;i++)
		{
			d1.insertEnd(i);
		}
		d1.insPos(3,7);
		d1.deleteBeg();
		d1.deleteEnd();
		d1.deleteAtAny(3);
		d1.traverse();
		// d1.traverseReverse();
	}
}