package A2;

public class TestaVeiculo {
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		Moto m1 = new Moto();
		Barco b1 = new Barco();
		
		
		c1.setMarca("Fiat Uno");
		c1.setQntdPortas(2);
		
		m1.setMarca("XJ6");
		m1.setQntdCilidradas(660);
		
		b1.setMarca("Cruzeiro");
		b1.setPotMotor(5000);
		
		
		System.out.println("Carro marca: " + c1.getMarca());
		System.out.println("Carro Portas: " + c1.getQntdPortas());
		System.out.println("Moto marca: " + m1.getMarca());
		System.out.println("Moto cilidradas: " + m1.getQntdCilidradas());
		System.out.println("Barco marca: " + b1.getMarca());
		System.out.println("Barco poder motor: " + b1.getPotMotor());
	}
}
