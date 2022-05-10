
public class Artesanato extends Produto {
private double transporte;
private double comissao;

public double calculaPreco() {
	double preco = this.getCusto() + this.getTransporte() + this.getComissao();
	return preco;
}

public double getTransporte() {
	return transporte;
}

public double getComissao() {
	return comissao;
}

public void setTransporte(double transporte) {
	this.transporte = transporte;
}

public void setComissao(double comissao) {
	this.comissao = comissao;
}


}
