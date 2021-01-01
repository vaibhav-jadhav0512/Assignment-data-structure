import java.util.*;
class DLL
{
	class Node
	{
		int data;
		Node left,right;
		Node(int e)
		{
			data=e;
			left=right=null;
		}
	}

	Node root,last;
	
	DLL()
	{
		root=last=null;
	}

	public void insertLeft(int e)
	{
		Node n=new Node(e);
		if(root==null)
		{
			root=last=n;
		}
		else
		{
			root.left=n;
			n.right=root;
			root=n;
		}
	}
	
	public void deleteLeft()
	{
		if(root==null)
		{
			System.out.println("List is empty!");
		}
		else
		{
			Node t= root;
			root=root.right;
			root.left=null;
			System.out.println(t.data+" removed");
		}
	}

	public void insertRight(int e)
	{
		Node n=new Node(e);
		if(root==null)
		{
			root=last=n;
		}
		else
		{
			last.right=n;
			n.left=root;
			last=n;
		}
	}

	public void deleteRight()
	{
		if(root==null)
		{
			System.out.println("List is empty!");
		}
		else
		{
			Node t= last;
			last=last.left;
			last.right=null;
			System.out.println(t.data+" removed");
		}
	}

	public void printLeft()
	{
		Node t=root;
		if(root==null)
		{
			System.out.println("List Empty!");
		}

		else
		{
			
			while(t!=null)
			{
				System.out.println(t.data);
				t=t.right;
			}
		}
	}

	public void printRight()
	{
		Node t=last;
		if(root==null)
		{
			System.out.println("List Empty!");
		}

		else
		{
			
			while(t!=null)
			{
				System.out.println(t.data);
				t=t.left;
			}
		}
	}
}

public class DoublyLL
{
	public static void main(String args[])
    	{
        DLL obj = new DLL(); 
        int ch, e;
	
	Scanner in = new Scanner(System.in);
        System.out.println("Enter choice");
       	do
	{
		System.out.println("1.insertLeft\n2.insertRight\n3.deleteLeft\n4.deleteRight\n5.printLeft\n6.printRight");
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
				System.out.println("Elements in list from left:\n");
				obj.printLeft();
				break;
			case 6:
				System.out.println("Elements in list from right:\n");
				obj.printRight();
				break;
			default:
				System.out.println("Incorrect bruh");
				break;
		}
	}
	while(ch!=0);
    	}
}