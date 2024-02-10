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
		
		   if(n>1){
		   int sum1 = 0;
		    for(int j=1; j<=n; j++){
		        if(j % 2 != 0){
		           for(int k=1; k<=m; k++){
		               if(k % 2 != 0){
		                   sum1++;
		               }
		           } 
		        }
		    }
		    System.out.println(sum1);
		}
		else{
		    int sum = 0;
		    for(int j=1; j<=m; j++){
		        if(j % 2 != 0){
		            sum++;
		        }
		    }
		    System.out.println(sum);
		}
		}
	}
}
