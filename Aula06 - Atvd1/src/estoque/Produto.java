package estoque;

public class Produto {
private long codigo;
private String nome;
private double valor;
private long estoque;

public long getCodigo() {
	return codigo;
}
public String getNome() {
	return nome;
}
public double getValor() {
	return valor;
}
public long getEstoque() {
	return estoque;
}
public void setCodigo(long codigo) {
	this.codigo = codigo;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setValor(double valor) {
	this.valor = valor;
}
public void setEstoque(long estoque) {
	this.estoque = estoque;
}


}
