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
		    if(x<=100){
		        System.out.println(x);
		    }
		    if(x>100 && x<=1000){
		        System.out.println(x-25);
		    }
		   if(x>1000 && x<=5000){
		       System.out.println(x-100);
		   }
		   if(x>5000){
		       System.out.println(x-500);
		   }
		}
	}
}