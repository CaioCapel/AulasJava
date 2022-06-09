
public class Mouse {

	
	//variaveis
	private String funciona;
	private String qtoBotoes;
	private String tamanho;
	
	
	//construtor
	public Mouse(String funciona, String qtoBotoes, String tamanho) {
		super();
		this.funciona = funciona;
		this.qtoBotoes = qtoBotoes;
		this.tamanho = tamanho;
	}
	
	//override para mostrar os dados
	@Override
	public String toString() {
		return "Mouse: funciona = " + funciona + ", qtoBotoes = " + qtoBotoes + ", tamanho = " + tamanho + "]\n";
	}
	
	public Mouse(String texto) {
		
		String[] arrayAuxiliar1 = texto.split(" , ");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split(" = ");
		this.funciona = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split(" = ");
		this.qtoBotoes = arrayAuxiliar3[1].trim();
		
		String[] arrayAuxiliar4 = arrayAuxiliar1[2].split(" = ");
		this.tamanho = arrayAuxiliar4[1].trim();
	}
	
	//getters e setters 
	public String isFunciona() {
		return funciona;
	}

	public void setFunciona(String funciona) {
		this.funciona = funciona;
	}

	public String isQtoBotoes() {
		return qtoBotoes;
	}

	public void setQtoBotoes(String qtoBotoes) {
		this.qtoBotoes = qtoBotoes;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	

	
}
