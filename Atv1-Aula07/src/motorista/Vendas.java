package motorista;

import logistica.frete.Carga;
public class Vendas extends Funcionario {
private double comissao;
private Carga carga;

public double getComissao() {
	return comissao;
}
public Carga getCarga() {
	return carga;
}
public void setComissao(double comissao) {
	this.comissao = comissao;
}
public void setCarga(Carga carga) {
	this.carga = carga;
}


}
