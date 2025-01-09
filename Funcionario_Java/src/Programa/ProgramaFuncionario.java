package Programa;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Funcionario;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		Funcionario Funcionarios = new Funcionario();
		
		System.out.printf("Digite o nome do funcionário: ");
		Funcionarios.name = sc.nextLine();
		System.out.printf("Digite o Salário Bruto deste funcionário: ");
		Funcionarios.SalarioBruto = sc.nextDouble();
		System.out.printf("Digite o valor do imposto: ");
		Funcionarios.taxa = sc.nextDouble();
		System.out.println();
		System.out.println("Funcionário: " + Funcionarios);
		System.out.println();
		System.out.printf("Qual a porcentagem que deseja incrementar no salário: ");
		double porcentagem = sc.nextDouble();
		Funcionarios.IncrementarSalario(porcentagem);
		System.out.println();
		System.out.printf("Dados Atualizados: " + Funcionarios);
		
		
		
		
		
		sc.close();

	}

}
