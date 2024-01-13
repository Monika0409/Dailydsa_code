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
		    
		    if(n%6==0){
		        System.out.println((n/6)*x);
		    }
		    else{
		        System.out.println(((n/6)+1)*x);
		    }
		}
	}
}
