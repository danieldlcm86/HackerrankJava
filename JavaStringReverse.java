package hackerRank;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        
        StringBuilder palabra = new StringBuilder(A);
        String palindromo = palabra.reverse().toString();
             
        if (A.equals(palindromo)) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
        
        scanner.close();
        
}

}
