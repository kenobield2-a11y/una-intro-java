/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String saladesejada= "A219";
	    String salainformada ="";
	    
	    Scanner scanner = new Scanner(System.in);
		System.out.println("digite o número da sala: ");
		    salainformada=scanner.next();
		    
		if(saladesejada.equals(salainformada)){// equals é a igualidade para as Strings//
		    System.out.println("você encontrou sua sala");
		} else {
		    System.out.println("você está perdido");
		}
		scanner.close();
	}
}