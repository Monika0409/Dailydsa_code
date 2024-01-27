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
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] ch = s.toCharArray();
            
            for (int j=0; j<n-1; j+=2) {
                
                char temp1 = ch[j];
                ch[j] = ch[j + 1];
                ch[j + 1] = temp1;
                
            }
            for (int j = 0; j<n; j++) {
                
                ch[j] = (char) (122 + 97 - ch[j]);
            }
            System.out.println(new String(ch));
        }
    
	}
}
