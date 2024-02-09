import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    
		    prime(m,n);
		}
	}
	public static boolean isPrime(int n)
    {
        if(n <= 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
               return false;
        }
        return true;
    }
    public static void prime(int m, int n)
    {
        for(int i=m;i<=n;i++)
        {
           if(isPrime(i))
           {
              System.out.println(i+" ");
           }
        }
        System.out.println();
    }
}
