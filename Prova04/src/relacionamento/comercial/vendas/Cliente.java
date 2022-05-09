package relacionamento.comercial.vendas;

import relacionamento.cadastros.internet.Email;
public class Cliente {
private long numero;
private double total;
private Email email[];

public long getNumero() {
	return numero;
}
public double getTotal() {
	return total;
}
public Email[] getEmail() {
	return email;
}
public void setNumero(long numero) {
	this.numero = numero;
}
public void setTotal(double total) {
	this.total = total;
}
public void setEmail(Email[] email) {
	this.email = email;
}


}
