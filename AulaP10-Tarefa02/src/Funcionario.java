
public class Funcionario {
private String nome;
private double salario;
private Empresa empresa;
private Endereco endereco;

public String getNome() {
	return nome;
}
public double getSalario() {
	return salario;
}
public Empresa getEmpresa() {
	return empresa;
}
public Endereco getEndereco() {
	return endereco;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public void setEmpresa(Empresa empresa) {
	this.empresa = empresa;
}
public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}
}
