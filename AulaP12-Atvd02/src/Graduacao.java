
public class Graduacao extends Estudante {
private double prova;
private double trabalho;

public double calculaMedia() {
	double media = (prova*0.6) + (trabalho*0.4);
	return media;
}

public double getProva() {
	return prova;
}

public double getTrabalho() {
	return trabalho;
}

public void setProva(double prova) {
	this.prova = prova;
}

public void setTrabalho(double trabalho) {
	this.trabalho = trabalho;
}
}
