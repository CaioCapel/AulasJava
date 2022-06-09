
public class Endereco {
	
	public Endereco(String[] arrayLinha) {
		String[] arrayNum = arrayLinha[0].split("=");
		this.numero = Integer.parseInt(arrayNum[1].trim());
		
		String[] arrayRua = arrayLinha[0].split("=");
		this.rua = arrayRua[1].trim();
		
		String[] arrayBairro = arrayLinha[0].split("=");
		this.bairro = arrayBairro[1].trim();
		
	}
	public Endereco() {
		// TODO Auto-generated constructor stub
	}


	//getters e setters
	@Override
	public String toString() {
		
		return " Rua = " + rua + ", Numero = " + numero + ", Bairro = "+ bairro;
	}

	private String rua;
	private int numero;
	private String bairro;
	
	
	public String getRua() {
		return rua;
	}
	
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	
	public int getNumero() {
		return numero;
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public String getBairro() {
		return bairro;
	}
	
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
}
