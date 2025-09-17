/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    
	public static void main (String[] args) {
	    int idade;
	    double altura;
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.print("digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("digite sua idade: ");
		idade =scanner.nextInt();
		System.out.print("digite sua altura: ");
		altura = scanner.nextDouble();
		
		System.out.println("nome: "+ nome);
		System.out.println("idade: " +idade);
		System.out.println("altura: " +altura);
		
	
        
	}
}