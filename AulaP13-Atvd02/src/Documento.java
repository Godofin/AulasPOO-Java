
public class Documento implements Impressao {
private String texto;
public int linhas = 180;

public void limpaBuffer() {
	
}

public boolean enviaFila() {
	return true;
}

public boolean obtemStatus() {
	return true;
}

public int linhaAtual() {
	return 1;
}

public String getTexto() {
	return texto;
}

public void setTexto(String texto) {
	this.texto = texto;
}

}
