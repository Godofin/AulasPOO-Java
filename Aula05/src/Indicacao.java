
public class Indicacao {
private String data;
private double brinde;
private Funcionario funcionario[];
private Cliente cliente[];

public String getData() {
	return data;
}
public double getBrinde() {
	return brinde;
}
public Funcionario[] getFuncionario() {
	return funcionario;
}
public Cliente[] getCliente() {
	return cliente;
}
public void setData(String data) {
	this.data = data;
}
public void setBrinde(double brinde) {
	this.brinde = brinde;
}
public void setFuncionario(Funcionario[] funcionario) {
	this.funcionario = funcionario;
}
public void setCliente(Cliente[] cliente) {
	this.cliente = cliente;
}


}
