package crm.relacionamento;

import comercio.vendas.Produtos;
public class Pessoa {
private String nome;
private Produtos produto[];

public String getNome() {
	return nome;
}
public Produtos[] getProduto() {
	return produto;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setProduto(Produtos[] produto) {
	this.produto = produto;
}


}
