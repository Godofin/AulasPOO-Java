
public class Disciplina {
private String nome;
private long carga;
private Aluno aluno[];
private Professor professor;
private Bibliografia bibliografia;

public String getNome() {
	return nome;
}
public long getCarga() {
	return carga;
}
public Aluno[] getAluno() {
	return aluno;
}
public Professor getProfessor() {
	return professor;
}
public Bibliografia getBibliografia() {
	return bibliografia;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setCarga(long carga) {
	this.carga = carga;
}
public void setAluno(Aluno[] aluno) {
	this.aluno = aluno;
}
public void setProfessor(Professor professor) {
	this.professor = professor;
}
public void setBibliografia(Bibliografia bibliografia) {
	this.bibliografia = bibliografia;
}



}
