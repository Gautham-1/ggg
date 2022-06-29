import java.util.Scanner;
class example1
{
	public static void main(String args[])
	{
		int a,b,c;

		  Scanner s1=new Scanner(System.in);
                
                  System.out.println("enter first value:");
		    a=s1.nextInt();

		  System.out.println("enter second value:");
		    b=s1.nextInt();

		  System.out.println("enter third value:");
		    c=s1.nextInt();	


		   
		  if(a>b)
		  {
		     if(a>c)
		       System.out.println("a is greater");
		  }
		  else if(b>c)
		   
                       System.out.println(" b is greater"); 
		  else
	               System.out.println(" c is greater"); 
	}
}	