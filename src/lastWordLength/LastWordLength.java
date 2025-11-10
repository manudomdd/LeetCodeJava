package lastWordLength;

import java.util.*;

class LastWordLength{
	
	public static Scanner scanner = new Scanner(System.in); 
	
	public static void main (String[] args) {
		System.out.print("Introduzca una frase cualquiera: "); 
		String prueba = scanner.nextLine();
		System.out.println("El tamaño de la ultima palabra es de " + lengthOfLastWord(prueba) + " caracteres."); 
	}
	
    public static int lengthOfLastWord(String s) {
        String[] palabras = s.split(" ");
        String palabraFinal = palabras[palabras.length - 1]; 
        int count = 0; 
        for (int i = 0; i < palabraFinal.length(); i++) {
            count++; 
        } 

        return count; 
    }  
}
