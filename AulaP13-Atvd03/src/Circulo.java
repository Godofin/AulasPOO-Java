
public abstract class Circulo implements Calculos {
private double raio;
private double circunferencia;

public double calcularArea() {
	double area = (pi * this.getRaio()) * (pi*this.getRaio());
	return area;
}


public double calcularPerimetro() {
	double perimetro = 2 * raio * circunferencia;
	return perimetro;
}


public double getCircunferencia() {
	return circunferencia;
}

public void setRaio(double raio) {
	this.raio = raio;
}

public void setCircunferencia(double circunferencia) {
	this.circunferencia = circunferencia;
}







private double getRaio() {
	// TODO Auto-generated method stub
	return 0;
}


}
