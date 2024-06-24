package ejercicio;
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.text.Normalizer;
import java.util.Scanner;

public class ExtraOrdinariaENDE {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Ingresa una palabra o frase: ");
		String palabra = input.nextLine().toLowerCase().replaceAll("\\s+", "");

		if (esPalindromo(palabra)) {
			System.out.println("'" + palabra + "' es un palíndromo.");
		} else {
			System.out.println("'" + palabra + "' no es un palíndromo.");
		}
	}

	public static boolean esPalindromo(String palabra) {
		int longitud = palabra.length();
		for (int i = 0; i < longitud / 2; i++) {
			if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static String quitarCaracteresEspeciales(String palabra) {
		String palabraSinCaracteresEspeciales = Normalizer.normalize(palabra, Normalizer.Form.NFD);
		palabraSinCaracteresEspeciales = palabraSinCaracteresEspeciales.replaceAll("\\p{M}", "");
		return palabraSinCaracteresEspeciales;
	}

}