
public class Vendedor extends Funcionario{
private double comissao;

public double calculaSalario() {
	return this.getSalarioBase()+this.getComissao();
}

public double getComissao() {
	return comissao;
}

public void setComissao(double comissao) {
	this.comissao = comissao;
}


}
