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
		    int c = sc.nextInt();
		    float d = (a+b)/2;
		    if(a+b > 2*c){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}
	}
}
