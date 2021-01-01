import java.util.*;
class CircularLL
{
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			this.data=d;
			next=null;
		}
	}

	Node root,last;

	CircularLL()
	{
		root=last=null;
	}

	public void insertLeft(int e)
	{
		Node n= new Node(e);

		if(root==null)
		{
			root=last=n;
			n.next=root;
		}

		else
		{
			n.next=root;
			root=n;
			last.next=root;
		}
	}

	public void deleteLeft()
	{
		if(root==null)
		{
			System.out.println("Empty list");
		}
		else
		{
			Node t=root;
			root=root.next;
			last.next=root;
			System.out.println(t.data+" removed");
		}
	}

	public void insertRight(int e)
	{
		Node n= new Node(e);

		if(root==null)
		{
			root=last=n;
			last.next=root;
		}

		else
		{
			last.next=n;
			last=n;
			last.next=root;
		}
	}

	public void deleteRight()
	{
		if(root==null)
		{
			System.out.println("Empty list");
		}
		else
		{
			Node t=root;
			Node t2=root;
			while(t!=last)
			{
				t2=t;
				t=t.next;
			}
			last=t2;
			last.next=root;
			System.out.println(t.data+" removed");
		}
	}

	public void printList()
	{
		
		if(root==null)
		{
			System.out.println("List Empty!");
		}

		else
		{
			Node t=root;
			do
			{
				System.out.println(t.data);
				t=t.next;
			}
			while(t!=root);
		}
	}
}

public class CircularLinkList
{
	public static void main(String args[])
    	{
        CircularLL obj = new CircularLL(); 
        int ch, e;
	
	Scanner in = new Scanner(System.in);
        System.out.println("Enter choice");
       	do
	{
		System.out.println("1.insertLeft\n2.insertRight\n3.deleteLeft\n4.deleteRight\n5.printList\n");
		ch=in.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter element to insert from left");
				e=in.nextInt();
				obj.insertLeft(e);
				break;
			case 2:
				System.out.println("Enter element to insert from right");
				e=in.nextInt();
				obj.insertRight(e);
				break;
			case 3:
				obj.deleteLeft();
				break;
			case 4:
				obj.deleteRight();
				break;
			case 5:
				System.out.println("Elements in list:\n");
				obj.printList();
				break;
			default:
				System.out.println("Incorrect bruh");
				break;
		}
	}
	while(ch!=0);
    	}
}