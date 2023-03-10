package hackerRank;

import java.util.Scanner;

public class JavaSubstringComparisons {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.next();
        int k = scanner.nextInt();
        
		System.out.println(s.substring(0, k));
		System.out.println(s.substring(k));
		
		scanner.close();
	}
}
