
public class Gerente extends Funcionario{
private double adcional;

public double calculaSalario() {
	double salario = this.getSalarioBase() + this.getAdcional();
	return salario;
}

public double getAdcional() {
	return adcional;
}

public void setAdcional(double adcional) {
	this.adcional = adcional;
}

}
