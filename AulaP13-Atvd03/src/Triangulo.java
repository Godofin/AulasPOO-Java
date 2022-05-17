
public class Triangulo implements Calculos {
private double altura;
private double base;
private double a, b, c;

public double calcularArea() {
	double area = (altura*base)/2;
	return area;
}

public double calcularPerimetro() {
	double perimetro = a+b+c;
	return perimetro;
}

public double getAltura() {
	return altura;
}

public double getBase() {
	return base;
}

public double getA() {
	return a;
}

public double getB() {
	return b;
}

public double getC() {
	return c;
}

public void setAltura(double altura) {
	this.altura = altura;
}

public void setBase(double base) {
	this.base = base;
}

public void setA(double a) {
	this.a = a;
}

public void setB(double b) {
	this.b = b;
}

public void setC(double c) {
	this.c = c;
}


}
