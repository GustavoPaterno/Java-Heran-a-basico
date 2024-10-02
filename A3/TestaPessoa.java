package A3;

public class TestaPessoa {
	public static void main(String[] args) {
		Juridica p1 = new Juridica();
		Fisica p2 = new Fisica();
		
		p1.setNome("Casarão do Banho");
		p1.setCnpj("12.345.678/0001-95");
		
		p2.setNome("Juliano");
		p2.setCpf("121.121.121-121");
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("CNPJ: " + p1.getCnpj());

		System.out.println("\nNome: " + p2.getNome());
		System.out.println("CPF: " + p2.getCpf());

	}
}
