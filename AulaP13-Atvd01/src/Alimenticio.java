
public class Alimenticio extends Produto {
private double valor;
private double peso;

public double calculaPreco() {
	double preco = this.getValor() * this.getPeso();
	return preco;
}

public double getValor() {
	return valor;
}

public double getPeso() {
	return peso;
}

public void setValor(double valor) {
	this.valor = valor;
}

public void setPeso(double peso) {
	this.peso = peso;
}


}
