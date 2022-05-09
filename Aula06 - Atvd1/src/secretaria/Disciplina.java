package secretaria;

import diretoria.Professor;
public class Disciplina {
private String sigla;
private int horas;
private Professor professor;

public String getSigla() {
	return sigla;
}
public int getHoras() {
	return horas;
}
public Professor getProfessor() {
	return professor;
}
public void setSigla(String sigla) {
	this.sigla = sigla;
}
public void setHoras(int horas) {
	this.horas = horas;
}
public void setProfessor(Professor professor) {
	this.professor = professor;
}


}
