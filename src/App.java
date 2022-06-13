import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  Ejercicio N° 6
		  Escriba un programa que determine si una palabra es palíndromo. 
		  Palíndromo: palabra o 
		  expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda, 
		  por ejemplo, arenera.
		  
		*/
		String palabra;
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingrese palabra:");
		palabra=leer.nextLine();
		
		System.out.println("Estoy imprimiendo la varible palabra:"+palabra);
		System.out.println("la palabra:"+palabra+" es palindromo? "+esPalindromo(palabra));

	}
	
	public static int esPalindromo(String p) {
		
		int j,i;
		j=p.length()-1;
		i=0;
		
		while(i<p.length() && p.charAt(i)==p.charAt(j)) {
			i++;
			j--;
		}
			
		if(i==p.length()) {
			return 1;
		}
		else return 0;
		
	}
	
	

}
