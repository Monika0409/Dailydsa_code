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
		    String s = sc.next();
		    char ch[] = s.toCharArray();
		    
		    boolean count1=false, count2=false, count3=false;
		    
		    for(int j=0; j<n; j++){
		        if(ch[j] == 'I'){
		            count1 = true;
		        }
		        else if(ch[j] == 'Y'){
		            count2 = true;
		        }
		        else{
		            count3 = true;
		        }
		    }
		    if(count1){
		        System.out.println("INDIAN");
		    }
		    else if(count2){
		        System.out.println("NOT INDIAN");
		    }
		    else{
		        System.out.println("NOT SURE");
		    }
		}
	}
}
