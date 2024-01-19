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
		    int a[] = new int[n];
		    
		    for(int j=0; j<n; j++){
		        a[j] = sc.nextInt();
		    }
		    int count=0;
		    for(int j=0; j<n; j++){
		        if(a[j]>=10 && a[j]<=60){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
