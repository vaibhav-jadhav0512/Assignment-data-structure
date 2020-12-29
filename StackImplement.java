import java.util.*;
class Stack
{
private int s[], maxsize, tos;

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

	public boolean isFull()
    	{
        if (tos == maxsize - 1)
            return true;
        else
            return false;
    	}

	public int pop()
   	{
        int temp;
        temp = s[tos];
        tos--;
        return temp;
    	}

	public boolean isEmpty()
    	{
        if (tos == -1)
            return true;
        else
            return false;
   	 }

	public void printStack()
    	{
        	for (int i = tos; i > -1; i--)
            	System.out.println(s[i]);
    	}

	public int atPeak()
    	{
       		return s[tos];
    	}
} 

public class StackImplement
{
	public static void main(String args[])
    	{
        Stack obj = null;
        int ch, e, n;

        System.out.println("Enter size");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        obj = new Stack(n);

	do
	{
		System.out.println("1.Push\n2.Pop\n3.AtPeak\n4.Print\n5.Exit\n");
		ch=in.nextInt();
		switch(ch)
		{
			case 1:
			if(obj.isFull()!=true)
			{
				System.out.println("Enter element");
				e=in.nextInt();
				obj.push(e);

			}
			else
			{
				System.out.println("Stack full bruh!!");
				
			}
			break;
			case 2:
			if(obj.isEmpty()!=true)
			{
				System.out.println("Element popped : "+obj.pop());
			}
			else 
			{
				System.out.println("Stack Empty bruh!!");
				
			}
			break;
			case 3:
			if(obj.isEmpty()!=true)
			{
				System.out.println("At peak : "+obj.atPeak());
				
			}
			break;

			case 4:
			if(obj.isEmpty()!=true)
			{
				obj.printStack();
			}
			else 
			{
				System.out.println("Stack empty");
				
			}
			break;
			case 5:
			break;
		
			default:
			System.out.println("Incorrect bruh");
			break;
		}
	}
	while(ch!=0);
    	}
}