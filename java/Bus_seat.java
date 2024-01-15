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
		    if(n<=10){
		        System.out.println("Lower Double");
		    }
		    else if(n>10 && n<=15){
		        System.out.println("Lower Single");
		    }
		    else if(n>15 && n<=25){
		        System.out.println("Upper Double");
		    }
		    else{
		        System.out.println("Upper Single");
		    }
		}
	}
}

