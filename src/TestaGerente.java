
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente karina = new Gerente();
		karina.setNome("Karina Pessanha");
		karina.setCpf("00055566698");
		karina.setSalario(6000.0);
		System.out.println("O nome da gerente e " + karina.getNome());
				
		karina.setSenha(100);
		boolean autenticou = karina.autentica(100);
		if (autenticou == true) {
			System.out.println("Sua senha e valida");
		} else {
			System.out.println("Sua senha e invalida, tente novamente");
		}
		
		System.out.println("A bonificacao da gerente e de " + karina.getBonificacao());
		

	}

}
