package local;

import secretaria.Disciplina;
public class Laboratorio {
private String nome;
private int lugares;
private Disciplina disciplina[];

public String getNome() {
	return nome;
}
public int getLugares() {
	return lugares;
}
public Disciplina[] getDisciplina() {
	return disciplina;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setLugares(int lugares) {
	this.lugares = lugares;
}
public void setDisciplina(Disciplina[] disciplina) {
	this.disciplina = disciplina;
}




}
