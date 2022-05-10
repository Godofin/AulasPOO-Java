
public class Industrializada extends Produto {
private double ipi;
private double icms;

public double calculaPreco() {
	double preco = this.getCusto()+ (this.getIpi()*this.getCusto()) +(this.getIcms()*this.getCusto()); 
	return preco;
}

public double getIpi() {
	return ipi;
}

public double getIcms() {
	return icms;
}

public void setIpi(double ipi) {
	this.ipi = ipi;
}

public void setIcms(double icms) {
	this.icms = icms;
}


}
