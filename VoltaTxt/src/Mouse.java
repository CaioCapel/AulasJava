
public class Mouse {

	private String funciona;
	private String qtoBotoes;
	private String tamanho;

	public Mouse(String funciona, String qtoBotoes, String tamanho) {
		super();
		this.funciona = funciona;
		this.qtoBotoes = qtoBotoes;
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return "Mouse: funciona = " + funciona + ", qtoBotoes = " + qtoBotoes + ", tamanho = " + tamanho + "\n";
	}
	
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
