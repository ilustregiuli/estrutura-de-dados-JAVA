package fila;

public class Fila {
	
	private No referenciaEntrada;
	
	public Fila() {
		this.referenciaEntrada = null;
	}
	
	public void enqueue (Object obj) {		// m�todo para adicionar na fila, recebe um novo "n�"
		No novoNo = new No(obj);
		novoNo.setProximo(this.referenciaEntrada); // o pr�ximo n� de "novo n�" vai receber a referencia de entrada
		this.referenciaEntrada = novoNo; // e a referencia de entrada, ser� esse novo n�
	}
	
	public Object first() {
		if(!isEmpty()) {
			No primeiroNo = this.referenciaEntrada;
			while(true) {
				if(primeiroNo.getProximo() != null) {
					primeiroNo = primeiroNo.getProximo();
				} else {
					break;
				}
			}
			return primeiroNo.getObject();
		} else {
			return null;
		}
		
	}
	
	public Object dequeue() {
		if(!this.isEmpty()) {	// verifica se a fila est� vazia
			No primeiroNo = this.referenciaEntrada;	// atribui a ref. de entrada como "Primeiro n�"
			No auxiliarNo = this.referenciaEntrada;	// atribui uma copia de ref. de entrada
			while(true) {							// loop at� achar o primeiro n�
				if(primeiroNo.getProximo() != null) {	// o n� ser� o primeiro quando apontar para "null"
					auxiliarNo = primeiroNo;			// o auxiliar recebe o "primeiro n�" (de entrada)
					primeiroNo = primeiroNo.getProximo();	//... e o primeiro n� agora aponta para o proximo dele mesmo
				} else {							// quando ele acha o primeiro, 
					auxiliarNo.setProximo(null);	// a c�pia � usada para setar a referencia do primeiro elemento como "null"
					break;
				}
			}
			return primeiroNo.getObject();
		} else {
			return null;
		}
		
	}
	
	public boolean isEmpty() {
		return this.referenciaEntrada == null ? true : false; // se o n� de referencia for "null", � porque a fila est� vazia
	}
	
	@Override
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = this.referenciaEntrada; // n� auxiliar recebe a refer�ncia do �ltimo da fila (ref. entrada)
		
		if(this.referenciaEntrada != null) {
			while(true) {
				stringRetorno += "[No {objeto=" + noAuxiliar.getObject() + "}] --->";
				if(noAuxiliar.getProximo() != null) {// verifica se o proximo n� n�o � "null" (e n�o tem somente um elemento na fila)
					noAuxiliar = noAuxiliar.getProximo(); // o n� auxiliar recebe o imediatamente pr�ximo
				} else {
					stringRetorno += "null";
					break;
				}
			}
		} else {
			stringRetorno = "null";
		}
		return stringRetorno;
	}

}
