import java.util.*;

class CirQueue
{
	private int CQ[], front, rear, maxsize,count;

	public CirQueue(int size)
	{
		maxsize=size;
		front=0;
		rear=-1;
		count=0;
		CQ = new int[maxsize];
	}

	public void Enq(int e)
	{
		count++;
		rear=(rear+1)%maxsize;
		CQ[rear]=e;
	}

	public boolean isFull()
	{
		if(count==maxsize)
		return true;
		else
		return false;
	}

	public int Deq()
	{
		count--;
		int temp=CQ[front];
		front=(front+1)%maxsize;
		return temp;
	}

	public boolean isEmpty()
	{
		if(count==0)
		return true;
		else 
		return false;
	}

	public void printCQ()
	{
		int i,c;
		i=front;
		for(c=0;c<count;c++)
		{
			System.out.println(CQ[i]);
			i=(i+1)%maxsize;
		}
	}
}

public class CirQimplement
{
	public static void main(String args[])
	{
		CirQueue obj = null;
        	int ch, e, n;

        System.out.println("Enter size");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        obj = new CirQueue(n);

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
				obj.printCQ();
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