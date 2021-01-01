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

	public void insert(int e)
	{
		Node n= new Node(e);
		n.next=null;
		if(LinkList.root==null)
			LinkList.root= new Node(e);

		
		Node last=LinkList.root;

		while(last.next!=null)
			last=last.next;

		last.next=n;
		
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

	public void sort() 
	{

    		Node t = root;
    		while (t != null) 
		{
			Node t2 = t.next;
        		while (t2 != null) 
			{
				if (t.data > t2.data) 
				{
                			int tmp = t.data;
                			t.data = t2.data;
                			t2.data = tmp;
            			}
            		t2 = t2.next;
        		}
        	t = t.next;
		}
    	}
}

public class SortLL
{
	public static void main(String args[])
    	{
        	LinkList obj = new LinkList(); 
		int e=0;

		Scanner in = new Scanner(System.in);

        	System.out.println("Enter 5 elements into first list");
		for(int i=0; i<5; i++)	
		{
			e=in.nextInt();
			obj.insert(e);
		}
		
		obj.sort();
		obj.printList();
	}
	
}