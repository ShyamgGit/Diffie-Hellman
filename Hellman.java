import java.util.Scanner;

class Hellman
{
	public static void main(String args[])
	{
        int p, g, a, b, A, B, S_A, S_B;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a prime number: ");
		p=sc.nextInt();
		System.out.println("Enter primitive root of "+p+": ");
		g=sc.nextInt();
		System.out.println("Choose 1st secret no: ");
		a=sc.nextInt();
		System.out.println("Choose 2nd secret no: ");
		b=sc.nextInt();
		
		A = (int)Math.pow(g,a)%p;
		B = (int)Math.pow(g,b)%p;
		
	    S_A = (int)Math.pow(B,a)%p;
		S_B =(int)Math.pow(A,b)%p;	
		
		if(S_A==S_B)
		{
			System.out.println("Both can communicate with each other!!!");
			System.out.println("They share a secret no = "+S_A);			
		}
		
		else
		{
			System.out.println("Both can't communicate with each other!!!");
		}
	}	
}