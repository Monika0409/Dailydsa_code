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
		    int p = sc.nextInt();
		    int q = sc.nextInt();
		    int y = (p+q)+1;
		    if(y%4==1 || y%4==2){
		        System.out.println("Alice");
		    }
		    else{
		        System.out.println("Bob");
		    }
		}
	}
}

