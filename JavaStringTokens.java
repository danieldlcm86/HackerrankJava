package hackerRank;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		
		//Se define las letras con el método split
        String[] tokens = s.split("[^a-zA-Z]");
        int numTokens = 0; 
        
        // para conocer el número de tokens
        for (int i=0; i<tokens.length; ++i) 
            if (tokens[i].length() > 0) 
                numTokens++;
            
        System.out.println(numTokens);
       
        for (int i=0; i<tokens.length;++i) 
            if (tokens[i].length() > 0)
                System.out.println(tokens[i]);
   }
		
	/*
	Utilizando el método split como regex
	String[] palabras = s.split("[,!?. '@]");
	int cuenta = palabras.length;
	//System.out.println(cuenta);
		
	for(String palabra : palabras) {
		System.out.println(palabra);
	}*/

}
