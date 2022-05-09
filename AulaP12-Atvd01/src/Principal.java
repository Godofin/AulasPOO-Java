
public class Principal {
Gerente g;
Funcionario f;
Vendedor v;

	public void entraDados() {
		v = new Vendedor();
		v.setNome("Rafael");
		v.setSalario(8000);
		v.setCtps("40028922");
		v.setComissao(4000);
		
		
		g = new Gerente();
		g.setNome("Marcio");
		g.setCtps("400389");
		g.setSalario(12000);
		g.setAdcional(2000);
		
		
	}
	
	public void mostraDados() {
		System.out.println("------Vendedor--------");
		System.out.println("Nome: " + v.getNome());
		System.out.println("Salário: " + v.getSalario());
		System.out.println("Ctps: " + v.getCtps());
		System.out.println("Comissão: " + v.getComissao());
		System.out.println("--------------------");
		
		System.out.println("------Gerente--------");
		System.out.println("Nome: " + g.getNome());
		System.out.println("Salário: " + g.getSalario());
		System.out.println("Ctps: " + g.getCtps());
		System.out.println("Comissão: " + g.getAdcional());
		System.out.println("--------------------");
	}

	public static void main(String args[]) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}
	
}
