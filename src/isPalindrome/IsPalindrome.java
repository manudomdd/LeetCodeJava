package isPalindrome;

import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.*;

class IsPalindrome {
	
	public static Scanner scanner = new Scanner(System.in); 
	
	public static void main (String[] args) {
		System.out.print("Introduzca una frase para comprobar si es palindroma: "); 
		String s = scanner.nextLine(); 
		System.out.println(isPalindrome(s) == true ? "Es palindroma" : "No es palindroma");  
	}
	
    public static boolean isPalindrome(String s) {
        ArrayList<Character> lista = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                lista.add(Character.toLowerCase(c));
            }
        }

        ArrayList<Character> alReves = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            alReves.add(lista.get(i));
        }

        for (int i = 0; i < lista.size(); i++) {
            if (!lista.get(i).equals(alReves.get(i))) {
                return false;
            }
        }

        return true;
    }
    
}
