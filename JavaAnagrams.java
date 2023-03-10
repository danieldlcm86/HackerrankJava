package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        scanner.close();
        
        //Convertir ambos Strings a un array de caracteres (.toCharArray) y también a minúsculas (.toLowerCase).
        char[] charArray1 = A.toLowerCase().toCharArray();
        char[] charArray2 = B.toLowerCase().toCharArray();
        
        //Ordenar los arrays de caracteres con el método .sort
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        //Comparar si los arreglos son iguales con un método Arrays.equals
        
        if(Arrays.equals(charArray1, charArray2)) {
        	System.out.println(true + ": Anagram");
        }else {
        	System.out.println(false + ": Not Anagram");
        }
        

        
	}

}
