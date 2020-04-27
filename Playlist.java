import java.util.*;
interface Song
{
	void Play();
	String Duration();
}
class Jazz implements Song
{
	static int b=11,i;
	String a[]=new String[100];
	Scanner s1=new Scanner(System.in);
	public Jazz(String a[], int i)
	{
		this.a=a;
		this.i=i;
	}
	
	public void Play()
{
		String name=s1.nextLine();
		String username=s1.nextLine();
		a[i]=name+" "+username;

}
public String Duration()
{
	b=b+1;
	return "00:01:"+b;
	
}
}
class Rock implements Song
{
		static int c=12,i;
	String a[]=new String[100];
	Scanner s1=new Scanner(System.in);
		public Rock(String a[], int i)
	{
		this.a=a;
		this.i=i;
	}
	public void Play()
{
         String name=s1.nextLine();
		String username=s1.nextLine();
		a[i]=name+" "+username;	
}
public String Duration()
{
	c=c+1;
	return "00:02:"+c;
}
}
class Ghazal implements Song
{
	static int a1=10,i;
	
	String a[]=new String[100];
	Scanner s1=new Scanner(System.in);
	public Ghazal(String a[], int i)
	{
		this.a=a;
		this.i=i;
	}
	
	public void Play()
{
	String name=s1.nextLine();
	String username=s1.nextLine();
	a[i]=name+" "+username;
}
public String Duration()
{
	a1=a1+1;
	return "00:03:"+a1;
}
}
class Playlist
{
	   static int i=0;
public static void main (String[] args)
	{
	Scanner s=new Scanner(System.in);
	
		String l="";
     
		String a[]=new String[100];
		int t2=0,m=0;
		while(true)
		{
			int t=s.nextInt();
		switch(t)
		{
			case 1:
			Jazz e1=new Jazz(a,i);
			 e1.Play();
			l=e1.Duration();
			a[i]=a[i]+" "+l;
		
			i++;
			 break;
			 	case 2:
				Rock e2=new Rock(a,i);
			  e2.Play();
			l=e2.Duration();
			a[i]=a[i]+" "+l;
		
			i++;
			 break;
			 	case 3:
		Ghazal e3=new Ghazal(a,i);
			  e3.Play();
			l=e3.Duration();
			a[i]=a[i]+" "+l;
			i++;
			 break;
			 default:
			 t2=1;
			 break;
			
		}
		if(t2==1)
		{
			
			System.out.println("Name of playlist , Name of singer, duration of song");
			System.out.println(" ");
			
			for(m=0;m<i;m++)
			System.out.println(a[m]);
				
			break;
		}
		
		}
	}
}
 