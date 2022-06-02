
public class Pessoa {

	private String nome;
	private int idade;
	private Endereco endereco;
	Sexo sexo;

	public Pessoa(String linha) {

		String[] arrayLinha = linha.split(",");
		String[] arrayNome = arrayLinha[0].split("=");
		this.nome = arrayNome[1].trim();

		String[] arraySexo = arrayLinha[1].split("=");
		this.sexo = Sexo.valueOf(arraySexo[1].trim());

		Endereco endereco = new Endereco(arrayLinha);
		this.endereco = endereco;

	}

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Nome = " + nome + ", Idade = " + idade + ", sexo = " + sexo + ", endereco = " + endereco + "\n";
	}
}