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
		    int k = sc.nextInt();
		    int m = sc.nextInt();
		    
		    if(n%(k*m) == 0){
		        System.out.println(n/(k*m));
		    }
		    else{
		        System.out.println(n/(k*m) + 1);
		    }
		}
	}
}
