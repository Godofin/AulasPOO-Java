
public class Imagem implements Impressao {
private String formato;
private long tamanho;

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

public String getFormato() {
	return formato;
}

public long getTamanho() {
	return tamanho;
}

public void setFormato(String formato) {
	this.formato = formato;
}

public void setTamanho(long tamanho) {
	this.tamanho = tamanho;
}


}
