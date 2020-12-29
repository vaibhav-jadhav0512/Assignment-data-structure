import java.util.*;

class PriorQueue
{
	private int PQ[], front, rear, maxsize;

	public PriorQueue(int size)
	{
		maxsize=size;
		front=0;
		rear=-1;
		PQ = new int[maxsize];
	}

	public void Enq(int e)
	{
		int i,j,temp;
		
		for(i=0; i<=rear-1; i++)
		{
			for(j=0; j<=rear-1; j++)
			{
				if(PQ[j] > PQ[j+1])
				{
					temp=PQ[j];
					PQ[j]=PQ[j+1];
					PQ[j+1]=temp;
				}
			}
		}
		rear++;
		PQ[rear]=e;

		
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
		int temp=PQ[front];
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

	public void printPQ()
	{
		for(int i=front; i<=rear; i++)
		{
			System.out.println(PQ[i]);
		}
	}
}

public class PriorQimplement
{
	public static void main(String args[])
	{
		PriorQueue obj = null;
        	int ch, e, n;

        System.out.println("Enter size");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        obj = new PriorQueue(n);

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
				obj.printPQ();
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