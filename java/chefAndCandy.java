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
		    int c = n-x;
		    if(n<=x){
		        System.out.println("0");
		    }
		    else if(c % 2 == 0){
		        System.out.println(c/4);
		    }
		    else{
		        System.out.println(c/4 + 1);
		    }
		}
	}
}
