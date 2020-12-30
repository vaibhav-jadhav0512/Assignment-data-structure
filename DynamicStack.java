import java.util.*;
class Stack
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

	Node tos;

	Stack()
	{
		tos=null;
	}

	public void push(int e)
	{
		Node n= new Node(e);
		if(tos==null)
		{
			tos=n;
		}
		else
		{
			n.next=tos;
			tos=n;
		}
	}
	
	public void pop()
	{
		if(tos==null)
		{
			System.out.println("Stack is empty buddy");
		}
		else
		{
			Node t=tos;
			tos=tos.next;
			System.out.println(t.data+" popped!");
		}
	}

	public void printStack()
	{
		for(Node t=tos; t!=null; t=t.next)
		{
			System.out.println(t.data);
		}
	}
}

public class DynamicStack
{
	public static void main(String args[])
    	{
        Stack obj = new Stack(); 
        int ch, e;
	
	Scanner in = new Scanner(System.in);
        System.out.println("Enter choice");
       	do
	{
		System.out.println("1.push\n2.pop\n3.print\n");
		ch=in.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter element to push");
				e=in.nextInt();
				obj.push(e);
				break;
			case 2:
				obj.pop();
				break;
			case 3:
				obj.printStack();
				break;
			default:
				System.out.println("Invalid input bruh");
				break;
		}
	}
	while(ch!=0);
	}
}