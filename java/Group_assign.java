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
		for(int j=0; j<t; j++){
		   int n = sc.nextInt();
	       int p[] = new int[n];
	       int group_size[] = new int[n+1];
	    
	       for(int i=0; i<n; i++){
	          p[i] = sc.nextInt();
	          group_size[p[i]]++;
	       }
	    
	       boolean happy = true ; 
	       for(int i=1; i<=n ;i++){
	          if(group_size[i] % i != 0){
	             happy = false;
	             break;
	          }
	       }
	       if(happy){
	           System.out.println("Yes");
	       }
	       else{
	           System.out.println("NO");
	       }
		}	    
	}
}