
public class Bebida {
	
	//atributos da bebida
	private String nome;
	private boolean aquecer;
	
	//método construtor, o construtor é usado para que outras classes possam acessar os atributos privados da classe atual
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	//método para qualquer bebida
	public void preparar() {
		System.out.println("Pegando o copo");
	}

	//getters e setters dos atributos
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public boolean isAquecer() {
		return aquecer;
	}


	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
	
	
}
