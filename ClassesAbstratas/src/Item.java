//a classe item é uma classe abstrata, seus métodos são genéricos e vão ser definidos melhor pelas classes que extenderem ela
public abstract class Item {
	//atribuindo variáveis
	private int posX;
	private int posY;
	
	//método pegar
	public abstract void pegar() ;

	//getters e setters são utilizados para pegar e atribuir valores
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	

}
