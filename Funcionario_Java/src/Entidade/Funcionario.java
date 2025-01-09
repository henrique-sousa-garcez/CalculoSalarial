package Entidade;

public class Funcionario {
	
	public String name;
	public double SalarioBruto;
	public double taxa;
	public double porcentagem;
	
	public double SalarioLiquido() {
		return SalarioBruto - taxa;
	}
	
	public void IncrementarSalario(double porcentagem) {
		SalarioBruto += SalarioBruto * porcentagem /100.0;
		
	}
	
	public String toString() {
    	return name
    		+ ", $"
    		+ String.format("%.2f", SalarioLiquido());
	}
}
