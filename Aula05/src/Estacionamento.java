
public class Estacionamento {
private String nome;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

private Moto moto[];
private Carro carro[];

public Moto[] getMoto() {
	return moto;
}

public Carro[] getCarro() {
	return carro;
}

public void setMoto(Moto moto[]) {
	this.moto = moto;
}

public void setCarro(Carro carro[]) {
	this.carro = carro;
}


}
