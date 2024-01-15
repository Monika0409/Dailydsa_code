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
		    int m = sc.nextInt();
		    
		    if(m>=n){
		        System.out.println(n);
		    }
		    else if(m==0){
		        System.out.println(n*2);
		    }
		    else{
		        System.out.println(n+(n-m));
		    }
		}
	}
}
