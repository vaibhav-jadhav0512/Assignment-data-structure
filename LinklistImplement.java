import java.util.*;
class LinkList
{
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}

	static Node root;

	LinkList()
	{
		LinkList.root=null;
	}

	public void insertLeft(int e)
	{
		Node n= new Node(e);
		n.next=null;

		if(LinkList.root==null)
		{
			LinkList.root=n;
		}
		else
		{
			n.next=LinkList.root;
			LinkList.root=n;
		}
	}

	public void insertRight(int e)
	{
		Node n= new Node(e);
		n.next=null;

		if(LinkList.root==null)
		{
			LinkList.root=n;
		}
		
		else
		{
			Node t=LinkList.root;

			while(t.next!=null)
			{
				t.next=n;
				t=t.next;
			}
		}
		
	}

	public void deleteLeft()
	{
		if(LinkList.root==null)
		{
			System.out.println("List empty bruh!");
		}

		else
		{
			Node t=LinkList.root;
			LinkList.root=LinkList.root.next;
			System.out.println(t.data+" removed");
		}
	}

	public void deleteRight()
	{
		if(LinkList.root==null)
		{
			System.out.println("List empty broda!!");
		}

		else
		{
			Node t=LinkList.root;
			Node t2=t;

			while(t.next!=null)
			{
				t2=t;
				t=t.next;
			}
			t2.next=null;
			System.out.println(t.data+" removed!");
		}
	}

	public void printList()
	{
		Node curr=LinkList.root;

		if(LinkList.root==null)
		{
			System.out.println("List Empty");
		}

		else
		{
			while(curr!=null)
			{
				System.out.println(curr.data+ " ");
				curr=curr.next;
			}
		}
	}

	public boolean search(int key)
	{
		if(LinkList.root==null)
		System.out.println("List is empty already!!");

		else
		{
			Node t=LinkList.root;
			while(t!=null)
			{
				if(t.data==key)
				return true;
				
				t=t.next;
			}
			
		}
		return false;
	}

	public void deleteSpecific(int key)
	{
		if(LinkList.root==null)
		{
			System.out.println("Empty list");
		}
		else
		{
			Node t=LinkList.root;
			Node t2=LinkList.root;

			while(t!=null && t.data!=key)
			{
				t2=t;
				t=t.next;
			}

			if(t==null)
			{
				System.out.println("Hard luck! Not Found!!");
			}

			else
			{
				if(t==root)
				{
					root=root.next;
				}
				else if(t.next==null)
				{
					t2.next=null;
				}
				else
				{
					t2.next=t.next;
				}
				System.out.println(t.data+" removed!");
				
			}
		}
	}
}

public class LinklistImplement
{
	public static void main(String args[])
    	{
        LinkList obj = new LinkList(); 
        int ch, e;
	
	Scanner in = new Scanner(System.in);
        System.out.println("Enter choice");
       	do
	{
		System.out.println("1.insertLeft\n2.insertRight\n3.deleteLeft\n4.deleteRight\n5.deleteSpecific\n6.printList\n7.search");
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
				System.out.println("Enter specific element");
				e=in.nextInt();			
				obj.deleteSpecific(e);
				break;
			case 6:
				obj.printList();
				break;
			case 7:
				System.out.println("Enter element to search in list");
				e=in.nextInt();
				obj.search(e);
			default:
			System.out.println("Incorrect bruh");
			break;
		}
	}
	while(ch!=0);
    	}
}