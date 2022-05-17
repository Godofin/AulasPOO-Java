
public class Eletronico extends Produto{
private double custo;
private int unidades;

public double calculaPreco() {
	double preco = this.getCusto() * this.getUnidades();
	return preco;
}

public double getCusto() {
	return custo;
}

public int getUnidades() {
	return unidades;
}

public void setCusto(double custo) {
	this.custo = custo;
}

public void setUnidades(int unidades) {
	this.unidades = unidades;
}


}
