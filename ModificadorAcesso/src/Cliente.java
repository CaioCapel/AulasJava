//importando classe objects
import java.util.Objects;

public class Cliente {
	
	//atributos privados pois as outras classes não podem acessa-los facilmente
	private String nome;
	private int cpf;
	private int numConta;
	
	//método cliente
	public Cliente() {
		super();
	}
	
	//pegando e atribuindo um valor usando getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	//toString é um método do java que retorna escrito o valor das variáveis
	@Override
	public String toString() {
		return "---------------------\n"
				+ "Cliente: \n nome=" + nome + ", \n cpf=" + cpf + ", \n numConta=" + numConta 
				+ "\n---------------------";
	}

	//hashCode é um método tambem do java que retorna variáveia como objetos
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, numConta);
	}

	//método equals serve para fazer comparações
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}
	
	
	
	
	
}
