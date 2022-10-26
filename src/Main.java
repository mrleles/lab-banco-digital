import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente hadassa = new Cliente();
		hadassa.setNome("Hadassa");
		Conta cc = new ContaCorrente(hadassa);
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(hadassa);

		Cliente leles = new Cliente();
		leles.setNome("Leles");
		Conta poupanca = new ContaPoupanca(leles);
		clientes.add(leles);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		// cc.imprimirExtrato();
		// poupanca.imprimirExtrato();

		Banco neon = new Banco();

		neon.setClientes(clientes);
		Iterator<Cliente> iterator = neon.getClientes().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getNome());
		}
	}

}
