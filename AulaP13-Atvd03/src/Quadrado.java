
public class Quadrado implements Calculos {
private double lado;

public double calcularArea() {
	double area = this.getLado() * this.getLado();
	return area;
}

public double calcularPerimetro() {
	double perimetro = this.getLado() * 4 ;
	return perimetro;
}

public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}


}

