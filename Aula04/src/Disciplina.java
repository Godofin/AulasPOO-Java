
public class Disciplina extends Veiculo{
private String nome;
private String sigla;
private Bibliografia bibliografia;
private Ementa ementa;

public String getNome() {
	return nome;
}
public String getSigla() {
	return sigla;
}
public Bibliografia getBibliografia() {
	return bibliografia;
}
public Ementa getEmenta() {
	return ementa;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setSigla(String sigla) {
	this.sigla = sigla;
}
public void setBibliografia(Bibliografia bibliografia) {
	this.bibliografia = bibliografia;
}
public void setEmenta(Ementa ementa) {
	this.ementa = ementa;
}


}
