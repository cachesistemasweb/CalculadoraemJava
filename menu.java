package calculadora;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class menu {

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Calculadora calc = new Calculadora();
	
	while(true) {
		System.out.println("Calculadora em JAVA");
		System.out.println("Escolha uma opção abaixo:");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Dividir");
		System.out.println("4 - Multiplicar");
		System.out.println("5 - Imprimir");
		System.out.println("6 - Sair");
		int valorMenu = in.nextInt();
		
		if(valorMenu == 1) {
			calc.setValor1(Float.parseFloat(
					JOptionPane.showInputDialog("Informe o valor 1")));
			calc.setValor2(Float.parseFloat(
					JOptionPane.showInputDialog("Informe o valor 2")));
			calc.somar();
		}else if(valorMenu == 2) {
			calc.setValor1(Float.parseFloat(
					JOptionPane.showInputDialog("Informe o valor 1")));
			calc.setValor2(Float.parseFloat(
					JOptionPane.showInputDialog("Informe o valor 2")));
			calc.subtrair();
			
		}
		
		else if(valorMenu == 3) {
			calc.setValor1(Float.parseFloat(
					JOptionPane.showInputDialog("Informe o valor 1")));
			calc.setValor2(Float.parseFloat(
					JOptionPane.showInputDialog("Informe o valor 2")));
			calc.dividir();
			
		}
		
		else if(valorMenu == 4) {
			calc.setValor1(Float.parseFloat(
					JOptionPane.showInputDialog("Informe o valor 1")));
			calc.setValor2(Float.parseFloat(
					JOptionPane.showInputDialog("Informe o valor 2")));
			calc.multiplicar();
			
		}
		

		else if(valorMenu == 5) {
			System.out.println(calc.getResultados());
		}
		
		
		else if(valorMenu == 6) {
			break;
		}
		System.out.println(calc.getResultado());
	}
	System.out.println(calc.getResultados());
	in.close();
}
}