import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		
		for(int i=0; i<n; i++){
		    a[i] = sc.nextInt();
		}
		int even=0 , odd=0;
		for(int i=0; i<n; i++){
		    if(a[i]%2==0){
		        even++;
		    }
		    else{
		        odd++;
		    }
		}
		 if(even > odd){
		        System.out.println("READY FOR BATTLE");
		    }
		    else{
		        System.out.println("NOT READY");
		    }
	}
}
