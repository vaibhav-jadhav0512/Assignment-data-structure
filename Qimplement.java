import java.util.*;

class Queue
{
	private int Q[], front, rear, maxsize;

	public Queue(int size)
	{
		maxsize=size;
		front=0;
		rear=-1;
		Q = new int[maxsize];
	}

	public void Enq(int e)
	{
		rear++;
		Q[rear]=e;
	}

	public boolean isFull()
	{
		if(rear==(maxsize-1))
		return true;
		else
		return false;
	}

	public int Deq()
	{
		int temp=Q[front];
		front++;
		return temp;
	}

	public boolean isEmpty()
	{
		if(front>rear)
		return true;
		else 
		return false;
	}

	public void printQ()
	{
		for(int i=front; i<=rear; i++)
		{
			System.out.println(Q[i]);
		}
	}
}

public class Qimplement
{
	public static void main(String args[])
	{
		Queue obj = null;
        	int ch, e, n;

        System.out.println("Enter size");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        obj = new Queue(n);

	do
	{
		System.out.println("1.Enqueue\n2.Deque\n3.Print\n4.Exit\n");
		ch=in.nextInt();
		switch(ch)
		{
			case 1:
			if(obj.isFull()!=true)
			{
				System.out.println("Enter element");
				e=in.nextInt();
				obj.Enq(e);

			}
			else
			{
				System.out.println("Queue full bruh!!");
				
			}
			break;
			case 2:
			if(obj.isEmpty()!=true)
			{
				System.out.println("Element removed : "+obj.Deq());
			}
			else 
			{
				System.out.println("Queue Empty bruh!!");
				
			}
			break;
			case 3:
			
			if(obj.isEmpty()!=true)
			{
				obj.printQ();
			}
			else 
			{
				System.out.println("Queue empty");
				
			}
			break;
			case 4:
			break;
		
			default:
			System.out.println("Incorrect input bruh");
			break;
		}
	}
	while(ch!=0);
	}
}