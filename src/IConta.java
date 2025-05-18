import java.util.Map;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();

	void bloquearConta();

	void desbloquearConta();

	void emitirCartao();

	void pagarFatura(double valor);

	void comprarNoCredito(double valor);
}
