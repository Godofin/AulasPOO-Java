
public abstract class Funcionario {
private long ctps;
private String nome;
private double salarioBase;

public abstract double calculaSalario();

public long getCtps() {
	return ctps;
}

public String getNome() {
	return nome;
}

public double getSalarioBase() {
	return salarioBase;
}

public void setCtps(long ctps) {
	this.ctps = ctps;
}

public void setNome(String nome) {
	this.nome = nome;
}

public void setSalarioBase(double salarioBase) {
	this.salarioBase = salarioBase;
}


}
