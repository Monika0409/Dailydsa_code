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
		    int n = sc.nextInt();
		    int fact = 1;
		    
		    for(int j=1; j<=n; j++){
		        fact = fact * j;
		    }
		    System.out.println(fact);
		}
	}
}
