
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario gustavo = new Funcionario();
		gustavo.setNome("Gustavo Cantisani");
		gustavo.setCpf("22233300087");
		gustavo.setSalario(4000.0);
		
		System.out.println("O nome do funcionario e " + gustavo.getNome());
		System.out.println("Seu cpf e " + gustavo.getCpf());
		System.out.println("Sua bonificacao sera de " + gustavo.getBonificacao());
	}

}
