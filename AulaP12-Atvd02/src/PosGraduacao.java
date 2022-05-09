
public class PosGraduacao extends Estudante {
private double artigo;
private double seminario;
private double projeto;

public double calculaMedia() {
	double media = (artigo*0.3) + (seminario*0.3) + (projeto*0.4);
	return media;
}

public double getArtigo() {
	return artigo;
}

public double getSeminario() {
	return seminario;
}

public double getProjeto() {
	return projeto;
}

public void setArtigo(double artigo) {
	this.artigo = artigo;
}

public void setSeminario(double seminario) {
	this.seminario = seminario;
}

public void setProjeto(double projeto) {
	this.projeto = projeto;
}


}
