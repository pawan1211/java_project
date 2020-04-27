import java.util.*;
import java.lang.*;
import java.io.*;

class Amount
{

  int TotalAmount(ArrayList<String> a2)
  {
	  int i,j,l=0,l2=0,s2=0,s3=0,s4=1,k=1000,h=100,m=1000000,p3=0,k1=0;
	  String p="";
	  		p=a2.get(0);
			char a3[]=p.toCharArray();
	 for(i=0;i<p.length();i++)
		{
	
			if(a3[i]==';')
			{
				l++;
				s4=1;
				s2=0;
				s3=0;
				l2=0;
			}				
		 if(l==3)
		 {
			if(a3[i]==',') 
			{
				l=0;
			}
			else if(a3[i]=='.')
			{
				s3=1;
		 }
		 else if(a3[i]=='K')
			{
				k1=k;
				if(s3==1)
				{
					k1=k/s4;
					
				}
				p3=p3+(k1*s2);
					

		 }
		 else if(a3[i]=='M')
			{
				k1=m;
				if(s3==1)
				{
					k1=m/s4;
				
				}
					p3=p3+(k1*s2);
						
	
				
		 }
		 else if(a3[i]=='H')
			{
				k1=h;
					if(s3==1)
				{
					k1=h/s4;
				
				}
					p3=p3+(k1*s2);
						
	
		 }
		 else if(a3[i]=='1'||a3[i]=='0'||a3[i]=='2'||a3[i]=='3'||a3[i]=='4'||a3[i]=='5'||
		 a3[i]=='6'||a3[i]=='7'||a3[i]=='8'||a3[i]=='9')
		 {
			 if(s3==1)
			 {
				 s4=s4*10;
			 }
			 l2=a3[i];
			 l2=l2-48;
			 s2=s2*10+l2;
			
			 
		 }
		 } 
		}
			return p3;
  }
				
	
	public static void main (String[] args)
	{
	Scanner s=new Scanner(System.in);
	
		
		Amount e1=new Amount();
		ArrayList<String> a1=new ArrayList<String> ();
			String a2=s.nextLine();
			a1.add(a2);	
		
		
		int l=e1.TotalAmount(a1);
		System.out.println("Total Order Amount in Rs for all orders ="+l);
	}
}
		
		