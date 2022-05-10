
public class Duplicata extends Documento {
private double valor;
private int atraso;
private double multa;


public double calculaTotal() {
	double total = this.getValor() + (this.getAtraso() * this.getMulta());
	return total;
}


public double getValor() {
	return valor;
}


public int getAtraso() {
	return atraso;
}


public double getMulta() {
	return multa;
}


public void setValor(double valor) {
	this.valor = valor;
}


public void setAtraso(int atraso) {
	this.atraso = atraso;
}


public void setMulta(double multa) {
	this.multa = multa;
}


}
