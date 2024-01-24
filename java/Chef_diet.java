import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] proteins = new int[n];
            
            for (int j = 0; j < n; j++) {
                proteins[j] = scanner.nextInt();
            }
            
            chefDiet(n, k, proteins);
        }
        
        scanner.close();
    }

    private static void chefDiet(int n, int k, int[] proteins) {
        int totalProtein = 0;
        
        for (int day = 0; day < n; day++) {
            totalProtein += proteins[day];
            
            if (totalProtein < k) {
                System.out.println("NO " + (day + 1));
                return;
            }
            
            totalProtein -= k;
        }
        
        System.out.println("YES");
    }
}
