/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{

	public static void main(String[] args) {
	    int numero_1,numero_2,soma,sub,mult,div;
	    Scanner scanner = new Scanner (System.in);
	    
		System.out.print("digite um numero: ");
		numero_1 = scanner.nextInt();
		
		System.out.print("digite outro numero: ");
		numero_2 = scanner.nextInt();
		
		soma = numero_1 + numero_2;
		sub = numero_1 - numero_2;
		mult= numero_1 * numero_2;
		div = numero_1 / numero_2;

		System.out.println("soma entre os numeros: "+soma);
		System.out.println("subtracao dos numeros: "+sub);
		System.out.println("multipllicacao dos numeros: "+mult);
		System.out.println("divisao dos numeros: "+div);
	}
}