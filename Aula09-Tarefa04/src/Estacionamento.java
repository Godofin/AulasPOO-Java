
public class Estacionamento {
private String nome;
private Veiculo cliente;
private Endereco endereco;
private Veiculo veiculo[];

public Veiculo[] getVeiculo() {
	return veiculo;
}
public void setVeiculo(Veiculo[] veiculo) {
	this.veiculo = veiculo;
}
public String getNome() {
	return nome;
}
public Veiculo getCliente() {
	return cliente;
}
public Endereco getEndereco() {
	return endereco;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setCliente(Veiculo cliente) {
	this.cliente = cliente;
}
public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}
}
