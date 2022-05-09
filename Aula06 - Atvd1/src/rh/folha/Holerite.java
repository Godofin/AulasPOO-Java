package rh.folha;

import rh.pessoal.Funcionario;

public class Holerite {
private long numero;
private String data;
private double total;
private Funcionario funcionario[];

public long getNumero() {
	return numero;
}
public String getData() {
	return data;
}
public double getTotal() {
	return total;
}
public Funcionario[] getFuncionario() {
	return funcionario;
}
public void setNumero(long numero) {
	this.numero = numero;
}
public void setData(String data) {
	this.data = data;
}
public void setTotal(double total) {
	this.total = total;
}
public void setFuncionario(Funcionario[] funcionario) {
	this.funcionario = funcionario;
}


}
