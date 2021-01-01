import java.util.*;
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
class LinkList
{

	
	Node root;

	public void insert(int e)
	{
		Node n= new Node(e);
		n.next=null;
		if(root==null)
		root= new Node(e);

		else
		{
		Node last=root;

		while(last.next!=null)
			last=last.next;
		last.next=n;
		}
	}

	public void printList()
	{
		Node curr=root;

		if(root==null)
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
class Merge 
{
	Node merge(Node rootA, Node rootB)
	{
		Node dummy= new Node(0);

		Node last= dummy;

		while(true)
		{
			if(rootA==null)
			{
				last.next=rootB;
				break;
			}
			if(rootB==null)
			{
				last.next=rootA;
				break;
			}
			if(rootA.data<=rootB.data)
			{
				last.next=rootA;
				rootA = rootA.next;
			}
			else
			{
				last.next = rootB;
				rootB =  rootB.next;
			}

			last=last.next;
		}
		return dummy.next;
	}
}

public class CombineSort
{
	

	
	public static void main(String[] args)
	{
		LinkList obj1= new LinkList();
		LinkList obj2= new LinkList();
		LinkList obj3= new LinkList();

		int e1=0, e2=0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter 5 elements into first list");
		for(int i=0; i<5; i++)	
		{
			e1=in.nextInt();
			obj1.insert(e1);
		}

		System.out.println("Enter 5 elements into second list");
		for(int i=0; i<5; i++)	
		{
			e2=in.nextInt();
			obj2.insert(e2);
		}
		
		obj3.root = new Merge().merge(obj1.root, obj2.root);
		obj3.sort();
		obj3.printList();
		
	}
	
}