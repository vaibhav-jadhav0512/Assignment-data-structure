import java.util.*;
class Queue
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

	Node rear,front;

	Queue()
	{
		rear=front=null;
	}

	public void enque(int e)
	{
		Node n= new Node(e);

		if(front==null)
		front=rear=n;

		else
		{
			rear.next=n;
			rear=n;
		}
	}

	public void deque()	
	{
		if(front==null)
		{
			System.out.println("Empty queue nibba");
		}
		else
		{
			Node t=front;
			front=front.next;

			System.out.println(t.data+" removed");
		}
	}

	public void printQueue()
	{
		for(Node t=front; t!=null; t=t.next)
			System.out.println(t.data);
	}
}
public class DynamicQueue
{
	public static void main(String args[])
    	{
        Queue obj = new Queue(); 
        int ch, e;
	
	Scanner in = new Scanner(System.in);
        System.out.println("Enter choice");
       	do
	{
		System.out.println("1.Enqueue\n2.Dequeue\n3.Print\n");
		ch=in.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter element");
				e=in.nextInt();
				obj.enque(e);
				break;
			case 2:
				obj.deque();
				break;
			case 3:
				obj.printQueue();
				break;
			default:
				System.out.println("Invalid input bruh");
				break;
		}
	}
	while(ch!=0);
	}
}