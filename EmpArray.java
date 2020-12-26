import java.util.List;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
class Employee implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	private int empid, salary;
	private String empname,desig;

	Employee(int empid,int salary,String empname, String desig)
	{
		this.empid=empid;
		this.salary=salary;
		this.empname=empname;
		this.desig=desig;
	}

	void disp()
	{
		System.out.println("Empid = "+empid);
		System.out.println("Salary = "+salary);
		System.out.println("empname = "+empname);
		System.out.println("Designamtion = "+desig);
	}
}

public class EmpArray implements Serializable 
{
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
	{
		Employee e1=new Employee(1001,50000,"Vaibhav","GM");
		Employee e2=new Employee(1002,20000,"Karan","HR");
		Employee e3=new Employee(1003,10000,"Arjun","BA");
		Employee e4=new Employee(1004,3000,"Rohan","HK");
		Employee e5=new Employee(1005,5000,"Vinit","CH");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);

		try
        	{
   	         FileOutputStream fos = new FileOutputStream(".//EmpData.txt");
 	         ObjectOutputStream oos = new ObjectOutputStream(fos);
 	         oos.writeObject(empList);
 	         oos.close();
 	         fos.close();
 		} 
  		catch (IOException ioe) 
   		{
  	          ioe.printStackTrace();
   		}

		try
        	{
            	FileInputStream fis = new FileInputStream(".//EmpData.txt");
            	ObjectInputStream ois = new ObjectInputStream(fis);
 
            	empList = (ArrayList) ois.readObject();
 
            	ois.close();
            	fis.close();
        	} 
        	catch (IOException ioe) 
        	{
            	ioe.printStackTrace();
            	return;
        	} 
        	catch (ClassNotFoundException c) 
        	{
            	System.out.println("Class not found");
            	c.printStackTrace();
            	return;
        	}
         
        	//Verify list data
        	for (Employee employee : empList) {
            	System.out.println(employee);
        	}
		
	}
}