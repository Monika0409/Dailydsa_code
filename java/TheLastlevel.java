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
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    if(x%3==0){
		        System.out.println(x*y + (x/3 - 1)*z);
		    }
		    else{
		        System.out.println(x*y + (x/3)*z);
		    }
		}
	}
}
