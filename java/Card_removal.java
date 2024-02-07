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
            int a[] = new int[n];
            
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : a) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            int maxFrequency = 0;

            for (int frequency : frequencyMap.values()) {
                maxFrequency = Math.max(maxFrequency, frequency);
            }

            int minMoves = n - maxFrequency;
            System.out.println(minMoves);
        }
	}
}









