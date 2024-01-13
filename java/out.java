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
		    int r[] = new int[4];
		    
		    for(int j=0; j<4; j++){
		        r[j] = sc.nextInt();
		    }
		    if(r[0]==0 && r[1]==0 && r[2]==0 && r[3]==0){
		       System.out.println("IN");
	        }
		    else{
		       System.out.println("OUT");
		    }
		}
	}
}
