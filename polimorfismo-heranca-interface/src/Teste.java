
public class Teste {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.setNome("Joao");
		f1.setCpf("235568413");
		f1.setSalario(5000.0);

		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());
		System.out.println(f1.getSalario());

		System.out.println(f1.getBonificacao());

		System.out.println("------------------");

		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("235568413");
		g1.setSalario(5000.0);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());

		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);

		System.out.println(autenticou);

		System.out.println(g1.getBonificacao());

	}

}
