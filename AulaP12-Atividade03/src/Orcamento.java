
public class Orcamento extends Documento{
private int quantidade;
private double unitario;

public double calculaTotal() {
	double total = this.getQuantidade() * this.getUnitario();
	return total;
}

public int getQuantidade() {
	return quantidade;
}

public double getUnitario() {
	return unitario;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public void setUnitario(double unitario) {
	this.unitario = unitario;
}


}

