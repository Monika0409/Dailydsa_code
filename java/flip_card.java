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
		    int x = sc.nextInt();
		    if(n-x==n || n-x==0){
		        System.out.println("0");
		    }
		    else if((n-x)>=x){
		        System.out.println(x);
		    }
		    else{
		        System.out.println(n-x);
		    }
		}
	}
}
