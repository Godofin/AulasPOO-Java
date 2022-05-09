package departamento.comercial.relacionamento;

import departamento.estoque.compra.*;
public class Fornecedor {
private String nome;
private String endereco;
private Pedido pedido[];

public String getNome() {
	return nome;
}
public String getEndereco() {
	return endereco;
}
public Pedido[] getPedido() {
	return pedido;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public void setPedido(Pedido[] pedido) {
	this.pedido = pedido;
}


}
