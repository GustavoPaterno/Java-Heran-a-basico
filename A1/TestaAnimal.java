package A1;

public class TestaAnimal {
	public static void main(String[] args) {
		Gato g1 = new Gato();
		Cachorro c1 = new Cachorro();
		
		g1.setNome("Bela");
		g1.setRaca("Frajola");
		c1.setNome("Dona");
		c1.setRaca("Caramelo");
		
		System.out.println("Nome: " + g1.getNome());
		System.out.println("Raça: " + g1.getRaca());
		
		System.out.println("\nNome: " + c1.getNome());
		System.out.println("Raça: " + c1.getRaca());
		
		System.out.println(g1.miar());
		System.out.println(c1.latir());
	}
}
