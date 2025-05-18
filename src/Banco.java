import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Banco {

	private String nome;
	private List<Conta> contas;
	private List<Cliente> clientes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Cliente> clientesComSaldoMinimo(double valor) {
		Map<Cliente, List<Conta>> clientesEContas = contas.stream().filter(conta -> conta.getSaldo() >= valor).collect(Collectors.groupingBy(Conta::getCliente));
		List<Cliente> clientes = new ArrayList<>();
		for (Cliente cliente : clientesEContas.keySet()) {
			clientes.add(cliente);
		}
		return clientes;
	}

}
