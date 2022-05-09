
public class Caminhao {
private String placa;
private int taxa;
private Carga carga[];
private Motorista motorista;

public String getPlaca() {
	return placa;
}
public int getTaxa() {
	return taxa;
}
public Carga[] getCarga() {
	return carga;
}
public Motorista getMotorista() {
	return motorista;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public void setTaxa(int taxa) {
	this.taxa = taxa;
}
public void setCarga(Carga[] carga) {
	this.carga = carga;
}
public void setMotorista(Motorista motorista) {
	this.motorista = motorista;
}


}
