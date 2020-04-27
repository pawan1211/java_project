

import java.util.*;
import java.lang.*;
import java.io.*;

class Employee1 
{
	String empno;
	 String ename;
	 String departmentName;
	 String location ;
	float salary;
public Employee1(String empno,String ename,String departmentName,String location,float salary)
{
	this.empno=empno;
	this.ename =ename;
	this.departmentName= departmentName;
	this.location =location;
	this.salary=salary;
	
}
public String toString()
{
	return empno+""+ename+""+departmentName+""+location+""+salary;
}
	
	public static void main (String[] args)
	{
	Scanner s=new Scanner(System.in);
	Scanner s1=new Scanner(System.in);
		 
		 String t1="";
	 String t2="";
	 String t3="";
	 String t4="" ;
	float t5=0f;

		Employee1 []a1=new Employee1[10];
		int i,n=10,j;

        for ( i=0; i<n; i++) 
		{
			String empno=s.nextLine();
			String eName=s.nextLine();
			String departmentName=s.nextLine();
			String location=s.nextLine();
			float salary =s1.nextFloat();
			a1[i]=new Employee1(empno,eName,departmentName,location,salary);
		}
  
     
		 for ( i=0; i<n; i++) 
		{
        System.out.println("employee number="+a1[i].empno); 
		    System.out.println("employee name="+a1[i].ename); 
			    System.out.println("employee departmentName="+a1[i].departmentName); 
				   System.out.println("employee location="+a1[i].location); 
				   				   System.out.println("employee location="+a1[i].location); 
				  System.out.println("employee salary="+a1[i].salary); 
				  System.out.println(" "); 
		}
		
		 for ( i=0; i<n; i++) 
		{
				 for (j=0; j<n-1-i; j++) 
		{
			if(a1[j].salary>a1[j+1].salary)
			{
				t1=a1[j].empno;
				a1[j].empno=a1[j+1].empno;
				a1[j+1].empno=t1;
				
				t2=a1[j].ename;
				a1[j].ename=a1[j+1].ename;
				a1[j+1].ename=t2;
				
				t3=a1[j].departmentName;
				a1[j].departmentName=a1[j+1].departmentName;
				a1[j+1].departmentName=t3;
				
				
					t4=a1[j].location;
				a1[j].location=a1[j+1].location;
				a1[j+1].location=t4;
				
				
					t5=a1[j].salary;
				a1[j].salary=a1[j+1].salary;
				a1[j+1].salary=t5;
	
				
			}
		}
		}
		
		System.out.println("sorted order by salary."); 
		System.out.println(""); 
		
			 for ( i=0; i<n; i++) 
		{
        System.out.println("employee number="+a1[i].empno); 
		    System.out.println("employee name="+a1[i].ename); 
			    System.out.println("employee departmentName="+a1[i].departmentName); 
				   System.out.println("employee location="+a1[i].location); 
				   				   System.out.println("employee location="+a1[i].location); 
				  System.out.println("employee salary="+a1[i].salary); 
				  System.out.println(" "); 
		}
		
		
	}
}
		
		