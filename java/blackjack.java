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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = 21-a-b;
		    if(c>=1 && c<=10){
		        System.out.println(c);
		    }
		    else{
		        System.out.println("-1");
		    }
		    
		}
	}
}

