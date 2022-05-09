
public class Pessoa {
private String nome;
private Funcionario funcionario;
private Cliente cliente;

public String getNome() {
	return nome;
}
public Funcionario getFuncionario() {
	return funcionario;
}
public Cliente getCliente() {
	return cliente;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setFuncionario(Funcionario funcionario) {
	this.funcionario = funcionario;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
}
