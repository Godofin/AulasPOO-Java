
public abstract class Produto {
private String nome;
private double custo;

public abstract double calculaPreco();

public String getNome() {
	return nome;
}

public double getCusto() {
	return custo;
}

public void setNome(String nome) {
	this.nome = nome;
}

public void setCusto(double custo) {
	this.custo = custo;
}


}
