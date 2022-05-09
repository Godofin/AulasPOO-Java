package porto;

import rh.Marinheiro;
import logistica.Container;

public class Barco {
private String nome;
private int ano;
private Marinheiro marinheiro[];
private Container container;
public String getNome() {
	return nome;
}
public int getAno() {
	return ano;
}
public Marinheiro[] getMarinheiro() {
	return marinheiro;
}
public Container getContainer() {
	return container;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setAno(int ano) {
	this.ano = ano;
}
public void setMarinheiro(Marinheiro[] marinheiro) {
	this.marinheiro = marinheiro;
}
public void setContainer(Container container) {
	this.container = container;
}


}
