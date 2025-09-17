/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{

	public static void main(String[] args) {
	    int numero_1,numero_2,soma;
	    Scanner scanner = new Scanner (System.in);
	    
		System.out.print("digite um numero: ");
		numero_1 = scanner.nextInt();
		
		System.out.print("digite outro numero: ");
		numero_2 = scanner.nextInt();
		
		soma = numero_1 + numero_2;

		System.out.print("o resultado entre os numeros digitados e: "+soma);
	}
}