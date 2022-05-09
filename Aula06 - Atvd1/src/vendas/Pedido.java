package vendas;

import rh.pessoal.Funcionario;

public class Pedido {
private long numero;
private String data;
private double total;
private Funcionario funcionario[];

public Funcionario[] getFuncionario() {
	return funcionario;
}
public void setFuncionario(Funcionario[] funcionario) {
	this.funcionario = funcionario;
}
public long getNumero() {
	return numero;
}
public String getData() {
	return data;
}
public double getTotal() {
	return total;
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


}
