package logistica.transporte;

import logistica.frete.Carga;
import motorista.Corrida;
public class Carro {
private String placa;
private String modelo;
private String marca;
private Carga carga[];
private Corrida corrida;

public Corrida getCorrida() {
	return corrida;
}
public void setCorrida(Corrida corrida) {
	this.corrida = corrida;
}
public String getPlaca() {
	return placa;
}
public String getModelo() {
	return modelo;
}
public String getMarca() {
	return marca;
}
public Carga[] getCarga() {
	return carga;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public void setCarga(Carga[] carga) {
	this.carga = carga;
}


}
