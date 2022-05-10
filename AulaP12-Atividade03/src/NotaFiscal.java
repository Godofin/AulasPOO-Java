
public class NotaFiscal extends Documento {
private double icms;
private double valor;

public double calculaTotal() {
	double total = this.getValor() + (this.getIcms() * this.getValor());
	return total;
}


public double getIcms() {
	return icms;
}


public double getValor() {
	return valor;
}


public void setIcms(double icms) {
	this.icms = icms;
}

public void setValor(double valor) {
	this.valor = valor;
}


}
