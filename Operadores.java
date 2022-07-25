package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		
		System.out.println("Insira sua nota do primeiro bimestre: ");
		a = leia.nextDouble();
		
		System.out.println("Insira sua nota do segundo bimestre: ");
		b = leia.nextDouble();
		
		System.out.println("Insira sua nota do terceiro bimestre: ");
		c = leia.nextDouble();
		
		System.out.println("Insira sua nota do quarto bimestre: ");
		d = leia.nextDouble();
		
		System.out.println("Sua nota final é: "+ (a + b + c + d) /4 );
		leia.close();
	}

}
