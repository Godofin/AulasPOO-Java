package departamento.compras.entrada;

public class Pedido {
private long numero;
private double total;
private Pedido pedido[];

public long getNumero() {
	return numero;
}
public double getTotal() {
	return total;
}
public Pedido[] getPedido() {
	return pedido;
}
public void setNumero(long numero) {
	this.numero = numero;
}
public void setTotal(double total) {
	this.total = total;
}
public void setPedido(Pedido[] pedido) {
	this.pedido = pedido;
}


}
