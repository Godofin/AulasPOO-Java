package comercial.vendas;

import comercial.produtos.Peca;
import pessoal.crm.Cliente;
import pessoal.crm.Vendedor;
public class NotaFiscal {
private long chaveNf;
private String data;
private double total;
private Peca peca[];
private Cliente cliente;
private Vendedor vendedor;

public long getChaveNf() {
	return chaveNf;
}
public String getData() {
	return data;
}
public double getTotal() {
	return total;
}

public Cliente getCliente() {
	return cliente;
}
public Vendedor getVendedor() {
	return vendedor;
}
public void setChaveNf(long chaveNf) {
	this.chaveNf = chaveNf;
}
public void setData(String data) {
	this.data = data;
}
public void setTotal(double total) {
	this.total = total;
}

public Peca[] getPeca() {
	return peca;
}
public void setPeca(Peca[] peca) {
	this.peca = peca;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public void setVendedor(Vendedor vendedor) {
	this.vendedor = vendedor;
}



}
