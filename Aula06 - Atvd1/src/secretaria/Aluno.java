package secretaria;

public class Aluno {
private long ra;
private String nome;
private Disciplina disciplina[];

public long getRa() {
	return ra;
}
public String getNome() {
	return nome;
}
public Disciplina[] getDisciplina() {
	return disciplina;
}
public void setRa(long ra) {
	this.ra = ra;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setDisciplina(Disciplina[] disciplina) {
	this.disciplina = disciplina;
}


}
