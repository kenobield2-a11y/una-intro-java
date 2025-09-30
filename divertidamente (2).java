/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int amizades,feitos,naoFeitos,totalExercicios=10;
	    int alegria = 0, tristeza = 0;//para inicialmente comecarem com 0.
	    double a1,a2,a3;
	  
	    
		System.out.println("A Riley fez alguma amizade na cidade?(nao = 0).se sim, quantas ela fez?");
		amizades = scanner.nextInt();
		if (amizades>0){
		alegria += amizades * 10;//"+=" vai adicionar o valor a variavel,para soma-los.
		    
		}
		else if (amizades == 0) {
		tristeza += 30;
		    
		    }
		else {
		    System.out.println("invalido.");
	}
	    System.out.println("Qual a nota da A1 de Riley");
	    a1 = scanner.nextDouble();
	    System.out.println("Qual a nota da A2 de Riley");
	    a2 = scanner.nextDouble();
	    System.out.println("Qual a nota da A3 de Riley");
	    a3 = scanner.nextDouble();
	    
	    double media = (a1 + a2 + a3) / 3;
	    
	    if (media >= 7) {
	        alegria += 50;
	        System.out.println("Riley esta aprovada!");
	    }
	    else {
	        tristeza += 50;
	        System.out.println("Riley nao foi aprovada!");
	        
	    }
	    System.out.println("Quantos dos 10 exercios voce conseguiu fazer Riley? ");
	    feitos = scanner.nextInt();
	    
	    if (feitos>=0 && feitos <= totalExercicios) {
	        naoFeitos = totalExercicios - feitos;
	        alegria += feitos * 10;
	        tristeza += naoFeitos * 10;
	        System.out.println("pontos alegria: "+ alegria);
	         System.out.println("pontos tristeza: "+ tristeza);
	    }
	    else{
	        System.out.println("Numero de exercicios invalido.");
	    }
	    
	   
	    if (alegria > tristeza) {

	        System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley. ");
	    }
	    
	    else if (tristeza > alegria) {
	        System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley. ");
	    }
	        
	        
}
}
