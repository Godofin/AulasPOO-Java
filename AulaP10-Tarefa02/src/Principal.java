
public class Principal {
Funcionario f;
Endereco e;
Empresa emp;

	public void entraDados() {
		e = new Endereco();
		e.setRua("Rua das flores");
		e.setNumero(928);
		
		
		emp = new Empresa();
		emp.setNome("Farmacia Brasil");
		
		f = new Funcionario();
		f.setNome("Carlos Eduardo");
		f.setSalario(4900.0);
		f.setEndereco(e);
		f.setEmpresa(emp);
		
	}
	
	public void mostraDados() {
		System.out.println("------Endereço--------");
		System.out.println("Rua: " + e.getRua());
		System.out.println("Numero: " + e.getNumero());
		System.out.println("-----------------------");
		
		System.out.println("------Empresa--------");
		System.out.println("Nome: " + emp.getNome());
		System.out.println("-----------------------");
		
		System.out.println("------Funcionario------");
		System.out.println("Dados de Funcionário:");
		System.out.println("Nome: " + f.getNome());
		System.out.println("Salario: " + f.getSalario());
		System.out.println("Nome da Empresa: " + f.getEmpresa().getNome());
		System.out.println("Endereço Rua: " + f.getEndereco().getRua());
		System.out.println("Endereço Número: " + f.getEndereco().getNumero());
		System.out.println("-----------------------");
		
	}
	
	public static void main(String args[]) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}
}
