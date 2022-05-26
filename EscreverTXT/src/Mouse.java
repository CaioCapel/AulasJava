
public class Mouse {

	

	private boolean funciona;
	private int qtoBotoes;
	private String tamanho;
	
	
	
	public Mouse(boolean funciona, int qtoBotoes, String tamanho) {
		super();
		this.funciona = funciona;
		this.qtoBotoes = qtoBotoes;
		this.tamanho = tamanho;
	}
	

	

	public boolean isFunciona() {
		return funciona;
	}

	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}

	public int isQtoBotoes() {
		return qtoBotoes;
	}

	public void setQtoBotoes(int qtoBotoes) {
		this.qtoBotoes = qtoBotoes;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return "Mouse [funciona = " + funciona + ", qtoBotoes = " + qtoBotoes + ", tamanho = " + tamanho + "]\n";
	}
	
}
