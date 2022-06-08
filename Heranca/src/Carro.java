//a classe carro extend da classe veiculo
public class Carro extends Veiculo {
	
		private boolean quatroPortas;

		//usamos o método imprimir pois o carro possui uma variável a mais
		@Override
		public void imprimir() {
			//herda todo o código do método imprimir
			super.imprimir();
			//adicionado para saber se o carro tem 4 portas 
			System.out.println("Tem 4 Portas: " + quatroPortas);
		}
		
		//getter e setter da variável boolean quatroPortas
		public boolean isQuatroPortas() {
			return quatroPortas;
		}
		
		public void setQuatroPortas(boolean quatroPortas) {
			this.quatroPortas = quatroPortas;
			
		      
		}
		
		

	
}
