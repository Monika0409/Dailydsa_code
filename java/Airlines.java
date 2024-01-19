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
		    int x = sc.nextInt();
		    int n = sc.nextInt();
		   
		   if(x*100 >= n){
		       System.out.println("0");
		   }
		   else if(n%100 != 0 ){
		       System.out.println((n-(100*x))/100 + 1);
		   }
		   else{
		       System.out.println((n-(100*x))/100);
		   }
		}
	}
}
