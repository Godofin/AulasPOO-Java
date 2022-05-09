
public class Principal {
Motorista m;
Acessorio a;
	
	public void entraDados(){
		m = new Motorista();
		m.setCnh(1234567);
		m.setNome("Cleiton");
		
		a = new Acessorio();
		a.setNome("Alarme");
		a.setPreco(29.9);
	}
	
	public void mostraDados() {
		System.out.println("------Motorista--------");
		System.out.println("CNH: " + m.getCnh());
		System.out.println("Nome: " + m.getNome());
		System.out.println("-----------------------");
		
		
		System.out.println("-------Acessorio-------");
		System.out.println("Nome: " + a.getNome());
		System.out.println("Preço: " + a.getPreco());
		System.out.println("-----------------------");
	}
	
	public static void main(String args[]) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}
}
