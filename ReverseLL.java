class Stack
{
	public int s[], maxsize, tos;

    	Stack(int size)
    	{
        maxsize = size;
        s = new int[maxsize];
        tos = -1;
    	}

	public void push(int e)
    	{
        	tos++;
        	s[tos] = e;
    	}

	public int pop()
   	{
        	int temp;
        	temp = s[tos];
        	tos--;
        	return temp;
    	}

	public void printStack()
    	{
        	for (int i = tos; i > -1; i--)
            	System.out.println(s[i]);
    	}
	
} 

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

	public void delete()
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

}

public class ReverseLL
{
	static Stack obj1= new Stack(5);
	static LinkList obj3= new LinkList();
	public static void addToStack()
	{
		for(int i=0; i<5; i++)
		{
			obj1.push(i);
		}
	}
	public static void addToList()
	{
		for(int i=0; i<5; i++)
		{
			obj3.insert(obj1.tos);
			obj1.pop();
		}
	}
	public static void main(String[] args)
	{
		LinkList obj= new LinkList();
		
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		
		addToStack();
		obj1.printStack();
		System.out.println("List:");
		obj3.printList();
		
	}
	
}