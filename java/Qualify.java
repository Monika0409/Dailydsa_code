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
		    int x = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    if((1*a + 2*b) >= x){
		        System.out.println("Qualify");
		    }
		    else{
		        System.out.println("NotQualify");
		    }
		}
	}
}
