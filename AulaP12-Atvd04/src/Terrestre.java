
public class Terrestre extends Veiculo{
private double km;
private double litros;

public double calculaConsumo() {
	double consumo = this.getLitros()/this.getKm();
	return consumo;
}

public double getKm() {
	return km;
}

public double getLitros() {
	return litros;
}

public void setKm(double km) {
	this.km = km;
}

public void setLitros(double litros) {
	this.litros = litros;
}


}
