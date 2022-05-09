
public class Caminhao {
private String placa;
private int eixos;
private Motorista motorista;
private Carga carga[];

public String getPlaca() {
	return placa;
}
public int getEixos() {
	return eixos;
}
public Motorista getMotorista() {
	return motorista;
}
public Carga[] getCarga() {
	return carga;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public void setEixos(int eixos) {
	this.eixos = eixos;
}
public void setMotorista(Motorista motorista) {
	this.motorista = motorista;
}
public void setCarga(Carga[] carga) {
	this.carga = carga;
}


}
