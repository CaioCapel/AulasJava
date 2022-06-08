
public class Constantes {

//	public static final double MEDIA_DA_PROVA = 7.0;
	
	//final é um método que não pode ser sobrescrito
	public static final double MEDIA_DA_PROVA;
	
	//foi definido que a média é uma constante, significa que nunca vai mudar
	static {
		MEDIA_DA_PROVA = 7.0;
	}
}
