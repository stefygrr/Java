package Exer01;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Pedro Marcos"," 245.876.732-07"," 4002-8922", "Osasco", "Casado");
		
		c1.visualizar();
		
		System.out.println();
		
		Cliente c2 = new Cliente("Lindaci Trindade", "984.654.185-80", "4169-1790","Carapicuiba", "Solteiro" );
		
		c2.visualizar();
		
		System.out.println();

	}

}
