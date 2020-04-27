import java.util.*;
import java.lang.*;
import java.io.*;

class SalOverflow extends Exception
{
	public 	SalOverflow(String s)
{
	super(s);
}
}
class Employee 
{

	int empno;
	float salary;
	String deptartmentName,emname;
	
	void  SalIncrease (int Percentage)
	{
		try{
			
			if(Percentage>100)
				throw new SalOverflow("SalOverflow");
			else
				
			System.out.println("Percentage value is less than or equal to 100");
				
			
			
		}
		catch(SalOverflow e)
		{
			System.out.println(e.getMessage());
		}
		
	}		
	public static void main (String[] args)
	{
	Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		Employee e1=new Employee();
		e1.SalIncrease(t);
	}
}
		
		