
public class Aquatico extends Veiculo{
private double horas;
private double litros;

public double calculaConsumo() {
	double consumo = this.getLitros()/this.getHoras();
	return consumo;
}

public double getHoras() {
	return horas;
}

public double getLitros() {
	return litros;
}

public void setHoras(double horas) {
	this.horas = horas;
}

public void setLitros(double litros) {
	this.litros = litros;
}



}
